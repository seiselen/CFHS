import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	private boolean addJokers = false;

	
	public Deck(){
		// STUB - YOUR CODE HERE
	}

	
	public Deck(boolean jokers){
		// STUB - YOUR CODE HERE
	}

	
	private void initDeck() {
		// STUB - YOUR CODE HERE
	}

		
	public int numCardsLeft() {
		return cards.size();
	}

	
	public void shuffleDeck() {
		// STUB - YOUR CODE HERE
	}

	
	public Card[] dealCards(int numCards) {
		// STUB - YOUR CODE HERE
		return null;
	}

	
	public Card dealCard() {
		// STUB - YOUR CODE HERE		
		return null;	
	}

	
	public String toString(){
		String ret = "Deck Contents >>>\n";	
		for (Card c : cards) {ret += " > "+c.toString()+"\n";}		
		return ret;
	}

	
	public void toConsole() {
		System.out.println(toString());
	}

} // Ends Class Deck