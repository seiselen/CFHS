
public class Card {
	private final Suit suit;
	private final Rank rank;

	
	public Card(Rank r, Suit s) {
		rank = r;
		suit = s;
	}

	
	public static Card createCard(Rank r, Suit s) {
		// STUB - YOUR CODE HERE
		return null;
	}

	
	public Suit getSuit() {
		return suit;
	}

	
	public int getSuitValue() {
		// STUB - YOUR CODE HERE		
		return -1;
	}	

	
	public String getSuitAsString() {
		// STUB - YOUR CODE HERE
		return null;
	}

	
	public Rank getRank() {
		return rank;
	}

	
	public int getRankValue() {
		// STUB - YOUR CODE HERE
		return -1;
	}

	
	public String getRankAsString() {
		// STUB - YOUR CODE HERE
		return null;
	}

	
	public boolean equals(Suit s, Rank r) {
		// STUB - YOUR CODE HERE
		return false;
	}

	
	public String toString(){
		return getRankAsString()+" of "+getSuitAsString();
	}

	
	public void toConsole() {
		System.out.println(toString());
	}		
	
} // Ends Class Card