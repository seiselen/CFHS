
public class Hand {
	Card[] cards;
	private final int maxCards = 5;
	private int       numCards = 0;
	
	
	public Hand(Card[] initCards) {	
		// STUB - YOUR CODE HERE
	} // Ends Constructor

	
	public boolean existsCard(Rank r, Suit s) {
		// STUB - YOUR CODE HERE
		return false;
	}

	
	private int indexOfCard(Rank r, Suit s) {
		// STUB - YOUR CODE HERE	
		return -1;
	}
	

	public boolean addCard(Card c) {
		// STUB - YOUR CODE HERE
		return false;
	}
	
	
	public Card removeCard(Rank r, Suit s) {
		// STUB - YOUR CODE HERE
		return null;
	}
	

    public void sortBySuit() {
		// STUB - YOUR CODE HERE
    }


    public void sortByValue() {
		// STUB - YOUR CODE HERE
    }
    
        
	public String toString(){
		String ret = "Hand Contents >>>\n";	
		for (Card c : cards) {ret += " > "+c.toString()+"\n";}	
		return ret;
	}

	
	public void toConsole() {
		System.out.println(toString());
	}	

} // Ends Class Hand
