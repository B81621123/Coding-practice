import java.util.Scanner;

public class a020 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String store = input.nextLine();
			char[] charArr = store.toCharArray();
			int storeInt = 0;
			if(charArr[0] == 'I') {
				storeInt = (charArr[0] - 39) / 10 + (charArr[0] - 39) % 10 * 9;
			} else if(charArr[0] < 'I' || charArr[0] == 'W') {
				storeInt = (charArr[0] - 55) / 10 + (charArr[0] - 55) % 10 * 9;
			} else if(charArr[0] > 'I' && charArr[0] < 'O') {
				storeInt = (charArr[0] - 56) / 10 + (charArr[0] - 56) % 10 * 9;
			} else if(charArr[0] == 'O') {
				storeInt = (charArr[0] - 44) / 10 + (charArr[0] - 44) % 10 * 9;
			} else if(charArr[0] > 'O' && charArr[0] < 'W') {
				storeInt = (charArr[0] - 57) / 10 + (charArr[0] - 57) % 10 * 9;
			} else if(charArr[0] > 'W' && charArr[0] < 'Z') {
				storeInt = (charArr[0] - 58) / 10 + (charArr[0] - 58) % 10 * 9;
			} else {
				storeInt = (charArr[0] - 57) / 10 + (charArr[0] - 57) % 10 * 9;
			}
			
			for(int i = 1 ; i < charArr.length - 1; i++) {
				storeInt = storeInt + (charArr[i] - 48) * (9 - i);
			}
			storeInt = storeInt + (charArr[9] - 48);
			if(storeInt % 10 == 0) {
				System.out.println("real");
			} else {
				System.out.println("fake");
			}
		}
	}
}
