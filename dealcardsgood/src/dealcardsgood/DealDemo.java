package dealcardsgood;

/**
 * 
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author yaji.sripada
 *
 */
public class DealDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		if (args.length < 2) {
            System.out.println("Usage: Deal hands cards");
            return;
        }
		
        int numHands = Integer.parseInt(args[0]);
        int cardsPerHand = Integer.parseInt(args[1]);
		Deck dk = new Deck();
				
		Collections.shuffle(dk.getList());
		
		for (int i = 0; i < numHands; i++)
            System.out.println(dealHand(dk.getList(), cardsPerHand));
	}
	
	public static <E> List<E> dealHand(List<E> deck, int n) {
        int deckSize = deck.size();
        List<E> handView = deck.subList(deckSize - n, deckSize);
        List<E> hand = new ArrayList<E>(handView);
        handView.clear();
        return hand;
    }
}