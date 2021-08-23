public class Card {
	
	private final Suit suit;
	private final Rank rank;

	public Card(Rank r, Suit s) {
		rank = r;
		suit = s;
	}
		
	public static Card createCard(Rank r, Suit s) {
		return new Card(r,s);
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public int getSuitValue() {
		switch(suit) {
		case CLUBS:    return 1;
		case DIAMONDS: return 2;
		case HEARTS:   return 3;
		case SPADES:   return 4;
		case JOKER:    return 5;
		default:       return -1;
		}
	}
	
	public String getSuitAsString() {
		switch(suit) {
		case CLUBS:    return "Clubs";
		case DIAMONDS: return "Diamonds";
		case HEARTS:   return "Hearts";
		case JOKER:    return "Joker";
		case SPADES:   return "Spades";
		default:       return "<Error>";
		}
	}
	
	public Rank getRank() {
		return rank;	
	}

	public int getRankValue() {			
		switch(rank) {
		case JOKER: return 0;
		case ACE:   return 14;
		case TWO:   return 2; 
		case THREE: return 3; 
		case FOUR:  return 4;
		case FIVE:  return 5;
		case SIX:   return 6;
		case SEVEN: return 7;
		case EIGHT: return 8;
		case NINE:  return 9;
		case TEN:   return 10;
		case JACK:  return 11;
		case QUEEN: return 12;
		case KING:  return 13;
		default:    return -1;
		}
	}
	
	public String getRankAsString() {
		switch(rank) {
		case JOKER: return "Joker";
		case ACE:   return "Ace";
		case TWO:   return "Two"; 
		case THREE: return "Three"; 
		case FOUR:  return "Four";
		case FIVE:  return "Five";
		case SIX:   return "Six";
		case SEVEN: return "Seven";
		case EIGHT: return "Eight";
		case NINE:  return "Nine";
		case TEN:   return "Ten";
		case JACK:  return "Jack";
		case QUEEN: return "Queen";
		case KING:  return "King";
		default:    return "<Error>";
		}
	}
	
	
	public boolean equals(Rank r, Suit s) {
		return(r==rank && s==suit);	
	}
		
	public boolean equals(Rank r) {
		return(r==rank);	
	}
	
	public boolean equals(Suit s) {
		return(s==suit);	
	}	
	
	
	public String toString(){return getRankAsString()+" of "+getSuitAsString();}
	public void toConsole() {System.out.println(toString());}		
	
} // Ends Class Card
