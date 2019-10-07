/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
            String[] arank = {"5", "10", "2"};
            String[] asuit = {"Hearts", "Clubs", "Diamonds"};
            int[] avalue = {3, 5, 10};
            Deck adeck = new Deck(arank, asuit, avalue);
            System.out.println("adeck size: " + adeck.size());
            System.out.println("Expected: 9");
            String[] brank = {"8", "4"};
            String[] bsuit = {"Spades", "Clubs"};
            int[] bvalue = {4, 6};
            Deck bdeck = new Deck(brank, bsuit, bvalue);
            System.out.println("is bdeck empty?: " + bdeck.isEmpty());
            System.out.println("Expected: false");
            String[] crank = {"7", "9", "11"};
            String[] csuit = {"Hearts", "Clubs", "Diamonds"};
            int[] cvalue = {7, 8, 10};
            Deck cdeck = new Deck(crank, csuit, cvalue);
            System.out.println("dealt card from cdeck: " + cdeck.deal());
            System.out.println("cdeck size: " + cdeck.size());
            System.out.println("Expected: 8");
        }
}