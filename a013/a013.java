import java.util.*;
import java.lang.*;
import java.io.*;

public class a013 {
	public static void main (String[] args) {
		String inputstr;
		int store = 0;
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			inputstr = input.nextLine();
			if(inputstr.length() == 1) break;
			String[] numArr = inputstr.split(" ");
			if( numArr[0].equals(numArr[1])) {
				System.out.println("ZERO");
				continue;
			}
			
			store = romeTonum(numArr[0]) - romeTonum(numArr[1]);
			if( store < 0) store = -store;
			System.out.println(numTorome(store));
		}
	}
	
	static int romeTonum (String r) {
		int store = 0;
		for( int i = 0 ; i < r.length() ; i++ ) {
			switch(r.charAt(i)) {
				case 'M':
					store += 1000;
					break;
				case 'D':
					store += 500;
					break;
				case 'C':
					if ( i+1 < r.length()  && r.charAt(i+1) == 'M' ) {
						store += 900;
						i++;
					}
					else if ( i+1 < r.length()  && r.charAt(i+1) == 'D' ) {
						store += 400;
						i++;
					}
					else {
						store += 100;
					}
					break;
				case 'L':
					store += 50;
					break;
				case 'X':
					if ( i+1 < r.length()  && r.charAt(i+1) == 'C' ) {
						store += 90;
						i++;
					}
					else if ( i+1 < r.length()  && r.charAt(i+1) == 'L' ) {
						store += 40;
						i++;
					}
					else {
						store += 10;
					}
					break;
				case 'V':
					store += 5;
					break;
				case 'I':
					if ( i+1 < r.length()  && r.charAt(i+1) == 'X' ) {
						store += 9;
						i++;
					}
					else if ( i+1 < r.length()  && r.charAt(i+1) == 'V' ) {
						store += 4;
						i++;
					}
					else {
						store += 1;
					}
					break;
			}
		}
		return store;
	}
	
	static String numTorome2 (int i) {
		String s = "";
		String temp = "";
		char[] chars = ("" + i).toCharArray();
		for( int j = chars.length - 1 ; j >= 0 ; j-- ) {
			temp = "";
			if( chars[j] == '9') {
				temp = temp + "IX";
			}
			else if( chars[j] == '4') {
				temp = temp + "IV";
			}
			else {
				if( Character.getNumericValue(chars[j]) >= 5) {
					temp = temp + "V";
					chars[j] = (char) ((int) chars[j] - 5);
				}
				for( int k = 0 ; k < Character.getNumericValue(chars[j]) ; k++ ) {
					temp = temp + "I";
				}
			}
			if( chars.length - j == 1 ) {
			}
			else if ( chars.length - j == 2) {
				temp = temp.replace('X', 'C');
				temp = temp.replace('V', 'L');
				temp = temp.replace('I', 'X');
			}
			else if ( chars.length - j == 3) {
				temp = temp.replace('X', 'M');
				temp = temp.replace('V', 'D');
				temp = temp.replace('I', 'C');
			}
			else {
				temp = temp.replace('I', 'M');
			}
			s = temp + s;
		}
		return s;
	}
	
	
	static String numTorome (int i) {
		String s = "";
		String temp = "";
		char[] chars = ("" + i).toCharArray();
		String[][] ssarr = {{"IX","IV","V","I"}, {"XC","XL","L","X"} , {"CM","CD","D","C"} , {"","","","M"}};
		for( int j = chars.length - 1 ; j >= 0 ; j-- ) {
			int index = chars.length - j  - 1;
			temp = "";
			if( chars[j] == '9') {
				temp = temp + ssarr[index][0];
			}
			else if( chars[j] == '4') {
				temp = temp + ssarr[index][1];
			}
			else {
				if( Character.getNumericValue(chars[j]) >= 5) {
					temp = temp + ssarr[index][2];
					chars[j] = (char) ((int) chars[j] - 5);
				}
				for( int k = 0 ; k < Character.getNumericValue(chars[j]) ; k++ ) {
					temp = temp + ssarr[index][3];
				}
			}
			s = temp + s;
		}
		return s;
	}
}