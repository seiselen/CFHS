public class Deck {
	private final int standardDeckSize = 52;
	private final int addJokerDeckSize = 54;
	
	private boolean addJokers = false;	
	private Card[]  cards;
	
	public Deck(){
		// STUB - YOUR CODE HERE
	}
	
	public Deck(boolean jokers){
		// STUB - YOUR CODE HERE	
	}	
		
	public Card getCardAt(int position){
		// STUB - YOUR CODE HERE
		return null; 
	}
	
	public int numCardsLeft() {
		// STUB - YOUR CODE HERE
		return -1;
	}
	
	public void shuffleDeck() {
		// STUB - YOUR CODE HERE
	}
	
	public void cutDeck(int position) {
		// STUB - YOUR CODE HERE
	}
	
	public Card[] dealCards(int numCards) {
		// STUB - YOUR CODE HERE
		return null;
	}
	
	public Card dealCard(int numCards) {
		// STUB - YOUR CODE HERE
		return null;
	}
	
	public String toString(){
		return "Ran Out Of Time - Will Update GitHub Code 10/14/20";
	}
	
	public void toConsole() {
		System.out.println(toString());
	}		

} // Ends Class Deck