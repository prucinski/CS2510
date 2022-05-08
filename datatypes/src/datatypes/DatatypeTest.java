package datatypes;

public class DatatypeTest {
	
	
	
	public static void main(String[] args) {
		int firstInt = 0;
		System.out.println(firstInt);
		boolean firstBool = false;
		byte firstByte = 0;
		short firstShort = 0;
		long firstLong = 0;
		char firstChar = 88;
		float firstFloat = 0;
		double firstDouble = 0;
		
		System.out.println(firstBool);
		System.out.println(firstByte);
		System.out.println(firstShort);
		System.out.println(firstLong);
		System.out.println(firstChar);
		System.out.println(firstFloat);
		System.out.println(firstDouble);
		
		printSizeMinAndMax(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);


		
		
	}

	private static void printSizeMinAndMax(Class<Integer> type, int size, int minValue, int maxValue) {
		System.out.printf("type:%-6s size:%-2s min:%-20s max:%s\n", type, size, minValue,
				maxValue);
		
	}
}
