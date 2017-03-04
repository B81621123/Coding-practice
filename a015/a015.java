import java.util.*;
import java.lang.*;
import java.io.*;

public class a015 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int inputstr;
		while (input.hasNext()) {
			int count = 0;
			int row = input.nextInt();
			int column = input.nextInt();
			int store[][] = new int[row][column];
			while (count < row) {
				for( int j = 0; j < column; j++) {
					inputstr = input.nextInt();
					store[count][j] = inputstr;
				}
				count++;
			}
			
			for( int i = 0; i < column; i++) {
				for( int j = 0; j < row; j++) {
					System.out.print(store[j][i]+" ");
				}
				System.out.println();
			}
		}
	}
}
