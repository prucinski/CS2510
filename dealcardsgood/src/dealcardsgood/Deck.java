package dealcardsgood;

/**
 * 
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaji.sripada
 *
 */
public class Deck {
	List<Card> cardList;
	
	public Deck(){
		super();
		cardList = new ArrayList<>();
		initializeDeck();
	}

	private void initializeDeck() {
		for(Suit s: Suit.values())
			for(Rank r: Rank.values())
				cardList.add(new Card(s,r,Integer.parseInt("1F0"+s.getCode()+r.getCode(),16)));
	}

	public List<Card> getList() {
		return cardList;
	}
}