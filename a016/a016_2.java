import java.util.Scanner;

public class a016_2 {
	static int[] iarr;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] rule_row = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		int[] rule_column = {0, 9, 18, 27, 36, 45, 54, 63, 72};
		int[] rule_rect = {0, 1, 2, 9, 10, 11, 18, 19, 20};
		
		
		while (in.hasNext()) {
		    iarr = new int[81];
			for(int i = 0;i < 81;i++) {
	    	   iarr[i] = in.nextInt();
	    	}
			
			boolean flag = true;
	    	for (int i = 0; i < 9;i++) {
	    	    if (!judge(rule_row[i], rule_column)
	    	    || !judge(rule_column[i], rule_row)
	    	    || !judge(0 + rule_rect[i] * 3, rule_rect)) {
	    	        flag = false;
	    	        break;
	    	    }
	    	}
	    	
	    	System.out.printf(flag?"yes\n":"no\n");
		}
		
	}
	
	static boolean judge(int start, int[] rule){
	    int[] judge_arr = new int[9];
	    int sum = 0;
	    for(int i = 0; i < 9;i++){
	        int index = start + rule[i];
	        sum += judge_arr[iarr[index]-1];
	        judge_arr[iarr[index]-1]++;
	        if(sum > 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
