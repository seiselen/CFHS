public class Hand {
	Card[] cards;
	private final int maxCards = 5;
	
	public Hand(){
		cards = new Card[maxCards];
	}
		
	public Hand(Card[] initCards) {
		// PARTIAL STUB - May want to make sure initCards.length == 5
		cards = initCards;
	}
	
	public boolean existsCard(Suit s, int v) {
		return false; // STUB		
	}
	
	public int indexOfCard(Suit s, int v) {
		// STUB - YOUR CODE HERE
		return -1;
	}	
	
	public Card getCardAtIndex(int i) {
		// STUB - YOUR CODE HERE
		return null;
	}
	
	public void addCard(Card c) {
		// STUB - YOUR CODE HERE
	}
	
	public void removeCard(Card c) {
		// STUB - YOUR CODE HERE
	}
		
	public void removeCard(int pos) {
		// STUB - YOUR CODE HERE
	}	
		
    public void sortBySuit() {
    	// STUB - YOUR CODE HERE
    }

    public void sortByValue() {
    	// STUB - YOUR CODE HERE
    }
	   
	public String toString(){
		return "Ran Out Of Time - Will Update GitHub Code 10/14/20";
	}
	
	public void toConsole() {
		System.out.println(toString());
	}	

} // Ends Class Hand
