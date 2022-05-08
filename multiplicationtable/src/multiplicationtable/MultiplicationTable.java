package multiplicationtable;

import java.util.Arrays;

public class MultiplicationTable {
	public static void main(String[] args) {
		int rows = 12;
		int columns = 12;
		int[][] multiplicationTable = new int[rows][columns];
		
		for(int i=0; i < rows; i++) {
			for (int j=0; j< columns; j++) {
				multiplicationTable[i][j] = (i+1)*(j+1);
			}
		}
		
		System.out.println(Arrays.deepToString(multiplicationTable).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
		

	}
}
