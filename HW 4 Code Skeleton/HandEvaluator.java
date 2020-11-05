import java.util.HashMap;

public class HandEvaluator {
	

	
	
	// ~~~BEHOLD THE LONGEST TERNARY SEQUENCE YOU'VE [likely] EVER SEEN~~~
	public static HandType evaluate(Hand h){
		return	(isFiveOfKind(h))    ? HandType.FIVE_OF_KIND   :
				(isRoyalFlush(h))    ? HandType.ROYAL_FLUSH    :
				(isStraightFlush(h)) ? HandType.STRAIGHT_FLUSH :
				(isFourOfKind(h))    ? HandType.FOUR_OF_KIND   :
				(isFullHouse(h))     ? HandType.FULL_HOUSE     :
				(isFlush(h))         ? HandType.FLUSH          :
				(isStraight(h))      ? HandType.STRAIGHT       :
				(isThreeOfKind(h))   ? HandType.THREE_OF_KIND  :
				(isTwoPair(h))       ? HandType.TWO_PAIR       :
				(isPair(h))          ? HandType.ONE_PAIR       : 
					                   HandType.HIGH_CARD;
	}
	
	private static boolean isFiveOfKind(Hand h){
		
		h.sortBySuit();
		
		int numJokers = 0;	
		if(h.cards[4].equals(Rank.JOKER, Suit.JOKER)){
			numJokers++;
			if(h.cards[3].equals(Rank.JOKER, Suit.JOKER)){numJokers++;}		
		}
		
		// short circuit: zero jokers -> disqualified 'off the bat'
		if(numJokers==0) {return false;}
		
		// transitivity: c1=c2 ^ c2=c3 -> c1=c3 -> c1=c2=c3
		if(h.cards[1].equals(h.cards[0].getRank()) && 
		   h.cards[2].equals(h.cards[1].getRank()) ){
			
			if(numJokers==2) {return true;}
			
			// 'mechanically' guaranteed that numJokers==1 and rank of cards 1/2/3 are same if we're in this code
			if(h.cards[3].equals(h.cards[2].getRank())){
				return true;
			}
		
		}
			
		return false;
	}
	
	
	private static boolean isRoyalFlush(Hand h) {
		
		// Let's first [dis]qualify the suit condition...
		if(h.cards[0].getSuit() == h.cards[1].getSuit() &&
		   h.cards[0].getSuit() == h.cards[1].getSuit() &&
		   h.cards[0].getSuit() == h.cards[1].getSuit() &&
		   h.cards[0].getSuit() == h.cards[1].getSuit() &&
		   h.cards[0].getSuit() == h.cards[1].getSuit() ){

			// Now we'll [dis]qualify the rank condition...
			if( h.cards[0].equals(Rank.TEN)   &&
				h.cards[1].equals(Rank.JACK)  &&	
				h.cards[2].equals(Rank.QUEEN) &&		
				h.cards[3].equals(Rank.KING)  &&	
				h.cards[4].equals(Rank.ACE)   ){
				return true;
			}
		}

		// "all roads go to Rome" : both disqualify conditions wind up here i.e. share the same 'return false'
		return false;
	}		
	
	
	// yeah, yeah... being lazy on this one (though it would otherwise be copy-paste of both methods, so...)
	private static boolean isStraightFlush(Hand h) {	
		return (isFlush(h) && isStraight(h));
	}	
	
	
	private static boolean isFourOfKind(Hand h){			
		HashMap<Rank, Integer> tally = new HashMap<Rank, Integer>();
		int numJokers = getNumJokers(h);
		
		// get frequency of cards by rank
		for (Card c : h.cards) {		
			tally.put(c.getRank(), tally.containsKey(c.getRank()) ? tally.get(c.getRank())+1 : 1);	
		}
		
		// qualify...
		for (Integer val : tally.values()) {	
			if((val==4) || (numJokers==1 && val==3) || (numJokers==2 && val==2)) {
				return true;
			}
		}
		// ...else disqualify
		return false;
	}
	
	
	private static boolean isFullHouse(Hand h){
		return false; // STUB
	}	
	
	
	private static boolean isFlush(Hand h){	
		// init this value with # of jokers, as they count!
		int numSameSuit = getNumJokers(h);
		
		// and increment whenever predecessor is of same suit
		for (int i = 1; i < h.cards.length; i++) {
			if (h.cards[i-1].getSuit() == h.cards[i].getSuit()) {numSameSuit++;}
		}
		
		// h.cards.length to show easy way to support scalability(-vs- simply '5')
		return (numSameSuit==h.cards.length);	
	}	

	
	private static boolean isStraight(Hand h){
		int i = getNumJokers(h);
		
		// after call: will expect joker[s] (if any) to be at front of array
		h.sortByValue();
		
		// neat use of numJokers, eh?!? we're also again looking at predecessors
		for(i+=1;i<h.cards.length; i++){
			if(h.cards[i-1].getRankValue()+1 != h.cards[i].getRankValue()){
				return false;
			}
		}
		
		// note how return value is true this time i.e. 'disqual-else-qual' -vs- 'qual-else-disqual'
		return true;
	}	
	
	
	private static boolean isThreeOfKind(Hand h){
		HashMap<Rank, Integer> tally = new HashMap<Rank, Integer>();
		int numJokers = getNumJokers(h);
		
		// get frequency of cards by rank
		for (Card c : h.cards) {		
			tally.put(c.getRank(), tally.containsKey(c.getRank()) ? tally.get(c.getRank())+1 : 1);	
		}
		
		// qualify...
		for (Integer val : tally.values()) {	
			if((val==3) || (numJokers==1 && val==2) || (numJokers==2 && val==1)) {
				return true;
			}
		}
		// ...else disqualify
		return false;
	}	
	
	
	// we assume that the "is<type>(...)" methods are called from highest to lowest ranking hand.
	// if that's the case - we do NOT need to handle jokers! If there are two jokers, they could
	// work with any other card to form a three-of-a-kind; if there is one joker and a pair, the
	// same scenario would occur and the hand would be judged as three-of-a-kind.
	private static boolean isTwoPair(Hand h){
		HashMap<Rank, Integer> tally = new HashMap<Rank, Integer>();
		
		for (Card c : h.cards) {		
			tally.put(c.getRank(), tally.containsKey(c.getRank()) ? tally.get(c.getRank())+1 : 1);	
		}
		
		int numPairsSeen = 0;
		
		for (Integer val : tally.values()) {	
			if(val==2) {
				numPairsSeen++;;
			}
		}

		return (numPairsSeen==2);			
	}	
	
	
	// we likewise assume two-pair and above have already been disqualified...
	private static boolean isPair(Hand h){	
		// short-circuit: joker and any other card makes a pair
		if(getNumJokers(h)>0) {return true;}
				
		HashMap<Rank, Integer> tally = new HashMap<Rank, Integer>();
		
		for (Card c : h.cards) {		
			tally.put(c.getRank(), tally.containsKey(c.getRank()) ? tally.get(c.getRank())+1 : 1);	
		}
		
		for (Integer val : tally.values()) {	
			if(val==2){return true;}
		}		
		
		return false;
	}


	
	// Be careful - this will sort the hand by suit: so expect/handle this accordingly!
	private static int getNumJokers(Hand h) {	
		h.sortBySuit();
		
		int numJokers = 0;	
		if(h.cards[4].equals(Rank.JOKER, Suit.JOKER)){
			numJokers++;
			if(h.cards[3].equals(Rank.JOKER, Suit.JOKER)){numJokers++;}		
		}
		
		return numJokers;		
	}


} // Ends Class HandEvaluator
