package dealcardsgood;

/**
 * 
 */


/**
 * @author yaji.sripada
 *
 */
public class Card {
	
	/**
	 * @param suit
	 * @param rank
	 */
	public Card(Suit suit, Rank rank,int code) {
		super();
		this.suit = suit;
		this.rank = rank;
		this.unicode=code;
	}
	Suit suit;
	Rank rank;
	int unicode;
	public Rank getRank() {
		return rank;
	}
	public Suit getSuit() {
		return suit;
	}
		
	/**
	 * @return the unicode
	 */
	public int getUnicode() {
		return unicode;
	}
	/**
	 * @param unicode the unicode to set
	 */
	public void setUnicode(int unicode) {
		this.unicode = unicode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new String(Character.toChars(unicode));
		//return "Card [" + prettyPrintRank(rank) + " of " + suit.getCode() + "]";
	}
	
	
	private String prettyPrintRank(Rank rank) {
		String rtn = "";
		if(rank.compareTo(Rank.ACE)==0)
			rtn="ACE";
		else if(rank.compareTo(Rank.JACK)==0)
			rtn="Jack";
		else if(rank.compareTo(Rank.QUEEN)==0)
			rtn="Queen";
		else if(rank.compareTo(Rank.KING)==0)
			rtn="King";
		else rtn= Integer.toString(rank.ordinal());
		return rtn;
	}
	
}