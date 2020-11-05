public class Hand {
	Card[] cards;
	private final int maxCards = 5;
	private int       numCards = 0;
	
	// Error Messages
	private final String constrcErr = "(Hand.Constructor) Error! Input Card[] is not of size "+maxCards+"!";
	private final String addCardErr = "(Hand.addCard) Error! Card cannot be added, returning false!";
	private final String remCardErr = "(Hand.removeCard) Error! Card not found, returning null!";


	public Hand(Card[] initCards) {	
		if(initCards.length!=maxCards) {
			throw new IllegalArgumentException(constrcErr);
		}
		cards = initCards;
		numCards = maxCards;
	} // Ends Constructor

	
	public boolean existsCard(Rank r, Suit s) {
		for (int i = 0; i < cards.length; i++) {
			if(cards[i].equals(r, s)) {
				return true;
			}	
		}
		return false;
	} // Ends Method existsCard

	
	private int indexOfCard(Rank r, Suit s) {
	
		// Go through the cards of this hand, one-by-one...
		for (int i = 0; i < cards.length; i++) {
			
			// Is this card the query?
			if(cards[i].equals(r, s)) {
				// If so... return the index		
				return i;
			}		
		}
		
		// Else...Return -1
		return -1;
		
	} // Ends Method indexOfCard
	

	public boolean addCard(Card c) {
		if(numCards<maxCards) {
			cards[numCards-1] = c;
			numCards++;
			return true;
		}
		
		System.err.println(addCardErr);
		return false;
	} // Ends Method addCard
	
	
	public Card removeCard(Rank r, Suit s) {
		if(existsCard(r, s)) {
			
			int index = indexOfCard(r, s);
			
			Card returnThis = cards[index];
			
			cards[index]=null;
					
			for (int i = index; i < cards.length-1; i++) {
				cards[i] = cards[i+1];
			}
			
			cards[maxCards-1] = null;
			
			numCards--;

			return returnThis;
		}
		
		else {
			System.err.println(remCardErr);
			return null;
		}
		
	} // Ends Method removeCard
	

    public void sortBySuit() {
    	Card temp;
    	for(int i = 1; i < numCards; i++){
			temp = cards[i];
			int j = i - 1;
			while(j >= 0 && cards[j].getSuitValue() > temp.getSuitValue()){
				cards[j + 1] = cards[j];
				j = j - 1;
			}
			cards[j + 1] = temp;
		}
    }


    public void sortByValue() {
    	Card temp; 	
    	for(int i = 1; i < numCards; i++){
			temp = cards[i];
			int j = i - 1;
			while(j >= 0 && cards[j].getRankValue() > temp.getRankValue()){
				cards[j + 1] = cards[j];
				j = j - 1;
			}
			cards[j + 1] = temp;
		}
    }
    
    
    // Just-For-Fun
    public void sortBySuitThenValue(){
    	Card temp; 	
    	for(int i = 1; i < numCards; i++){
			temp = cards[i];
			int j = i - 1;
			while(j >= 0 && ( (cards[j].getSuitValue() > temp.getSuitValue()) || ((cards[j].getSuitValue() == temp.getSuitValue()) &&(cards[j].getRankValue() > temp.getRankValue())))){
				cards[j + 1] = cards[j];
				j = j - 1;
			}
			cards[j + 1] = temp;
		}    	
    }

    
	public String toString(){
		String ret = "Hand Contents >>>\n";	
		for (Card c : cards) {			
			if(c==null) {ret += " > "+"Null Card"+"\n";} 
			else        {ret += " > "+c.toString()+"\n";}
		}	
		return ret;
	}

	
	public void toConsole() {
		System.out.println(toString());
	}

} // Ends Class Hand
