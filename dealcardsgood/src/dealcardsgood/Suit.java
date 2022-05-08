package dealcardsgood;
/**
 * 
 */

/**
 * @author yaji.sripada
 *
 */
public enum Suit {
	SPADES('A'),
	DIAMONDS('B'),
	HEARTS('C'),
	CLUBS('D');
	
	private char unicode;
	
	private Suit(char code){
		this.unicode=code;
	}
	
	/**
	 * @return the code
	 */
	public char getCode() {
		return unicode;
	}
}