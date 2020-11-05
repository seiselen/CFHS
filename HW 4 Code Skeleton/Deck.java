import java.util.*;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	private boolean addJokers = false;
	
	
	// Error Messages	
	private final String dealCardErr = "(Deck.dealCards) Error! Not enough cards left in deck for operation. Returning null!";


	// Create unshuffled deck of cards
	public Deck(){
		addJokers = false;
		initDeck();
	} // Ends Constructor

	
	public Deck(boolean jokers){
		addJokers = jokers;
		initDeck();
	} // Ends Constructor

	
	// Populate the deck of cards.
	private void initDeck() {
		for(Suit s : Suit.values()) {
			for(Rank r : Rank.values()) {
				if(s!=Suit.JOKER && r!=Rank.JOKER) {
					cards.add(new Card(r, s));
				}
			}
		}
	
		if(addJokers) {
			cards.add(new Card(Rank.JOKER, Suit.JOKER));
			cards.add(new Card(Rank.JOKER, Suit.JOKER));			
		}

	} // Ends Method initDeck

		
	public int numCardsLeft() {
		return cards.size();
	} // Ends Method numCardsLeft

	
	public void shuffleDeck() {
		Collections.shuffle(cards);
	} // Ends Method shuffleDeck

	
	public Card[] dealCards(int numCards) {
		if(cards.size()<numCards) {
			System.err.println(dealCardErr);
			return null;
		}
						
		Card[] out = new Card[numCards];
		
		for (int i = 0; i < out.length; i++) {
			out[i] = cards.remove(cards.size()-1);
		}

		return out;
	} // Ends Method dealCards

	
	// neat trick - share with students
	public Card dealCard() {	
		return dealCards(1)[0];		
	} // Ends Method dealCard

	
	public String toString(){
		String ret = "Deck Contents >>>\n";	
		for (Card c : cards) {ret += " > "+c.toString()+"\n";}		
		return ret;
	} // Ends Method toString
	
	
	public void toConsole() {
		System.out.println(toString());
	} // Ends Method toConsole	

} // Ends Class Deck
