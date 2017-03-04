import java.util.*;
import java.lang.*;
import java.io.*;

public class a016 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int store[][] = new int[9][9];
			Boolean repeat = false;
			cin :{
				for(int i = 0; i < 9; i++) {
					int compare[] = new int[9];
					for(int j = 0; j < 9; j++) {
						if(compare[j] == 0) {
							compare[j] = 1;
						}
						else {
							repeat = true;
							break cin;
						}
						store[i][j] = input.nextInt();
					}
				}
			}
			if(!repeat) {
				repeat = judge_colume(store);
			}
			if(!repeat) {
				check :{
				for(int i = 0; i < 6; i+=3) {
						for(int j = 0; j < 6; j+=3) {
							if(judge_square(store, i, j)) {
								repeat = true;
								break check;
							}
						}
					}
				}
			}
			if(repeat) {
				System.out.println("no");
			}
			else {
				System.out.println("yes");
			}
		}
	}
	
	static boolean judge_colume (int store[][]) {
		for(int i = 0; i < 9; i++) {
			int compare[] = new int[10];
			for(int j = 0; j < 9; j++) {
				if(compare[store[j][i]] == 0) {
					compare[store[j][i]] = 1;
				}
				else {
					return true;
				}
			}
		}
		return false;
	}
	
	static boolean judge_square (int store[][], int i, int j) {
		int compare[] = new int[10];
		int tmp = i;
		for(int k = 0; k < 2; k++) {
			for(int l = 0; l < 2; l++) {
				if(compare[store[i][j]] == 0) {
					compare[store[i][j]] = 1;
				}
				else {
					return true;
				}
				i++;
			}
			i = tmp;
			j++;
		}
		return false;
	}
}
