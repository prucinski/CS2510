package leapyears;

import java.util.Arrays;

public class leapYears {

	public static void main(String[] args) {
		
		printYears(30, 2020);
		

	}
	static void printYears(int numberOfYears, int currentYear) {
		int[] arrayOfLeaps;
		arrayOfLeaps = new int[numberOfYears];
		currentYear = currentYear + (4-currentYear%4);
		for(int i = 0; i <numberOfYears; i++ ) {
			if(currentYear%100 != 0) {
				arrayOfLeaps[i] = currentYear;
				currentYear = currentYear +4;
			}
			else if(currentYear%100 == 0 && currentYear%400== 0) {
				arrayOfLeaps[i] = currentYear;
				currentYear = currentYear +4;
			}
			else {
				currentYear = currentYear+4;
				i--;
			}
		}
		System.out.println("hello" + Arrays.toString(arrayOfLeaps) + arrayOfLeaps.length);
	}

}
