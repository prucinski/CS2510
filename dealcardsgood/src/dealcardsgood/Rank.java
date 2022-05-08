package dealcardsgood;
/**
 * 
 */



/**
 * @author yaji.sripada
 *
 */
public enum Rank {
	ACE('1'),
	TWO('2'),
	THREE('3'),
	FOUR('4'),
	FIVE('5'),
	SIX('6'),
	SEVEN('7'),
	EIGHT('8'),
	NINE('9'),
	TEN('A'),
	JACK('B'),
	QUEEN('C'),
	KING('D');
	
	private char unicode;
	
	private Rank(char code){
		this.unicode = code;
	}

	/**
	 * @return the code
	 */
	public char getCode() {
		return unicode;
	}
}