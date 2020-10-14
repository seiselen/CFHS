public class Card {
	private final Suit suit;
	private final Rank rank;
	
	// Cannot make this a stub, so you get it for free!
	public Card(Rank r, Suit s) {
		rank = r;
		suit = s;
	}
	
	public Suit getSuit() {
		// STUB - YOUR CODE HERE
		return Suit.JOKER;
	}
	
	public String getSuitAsString() {
		// STUB - YOUR CODE HERE
		return "";
	}
	
	public Rank getRank() {
		// STUB - YOUR CODE HERE
		return Rank.JOKER;
	}
	
	public int getRankValue() {
		// STUB - YOUR CODE HERE
		return -1;		
	}
	
	public String getRankAsString() {
		// STUB - YOUR CODE HERE
		return "";
	}
	
	public String toString(){
		return getRankAsString()+" of "+getSuitAsString();
	}
	
	public void toConsole() {
		System.out.println(toString());
	}

} // Ends Class Card