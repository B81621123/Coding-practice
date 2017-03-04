#include <stdio.h>
#include <stdbool.h>

bool judge(int start, int rule[]);
int iarr[81] = {0};

int main() {
	while (scanf("%d", &iarr[0])!=EOF){
    	for(int i = 1;i < 81;i++) {
    	   scanf("%d", &iarr[i]);
    	}
    	
    	int rule_row[9] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    	int rule_column[9] = {0, 9, 18, 27, 36, 45, 54, 63, 72};
    	int rule_rect[9] = {0, 1, 2, 9, 10, 11, 18, 19, 20};
    	
    	bool flag = true;
    	for (int i = 0; i < 9;i++) {
    	    if (!judge(rule_row[i], rule_column)
    	    || !judge(rule_column[i], rule_row)
    	    || !judge(0 + rule_rect[i] * 3, rule_rect)) {
    	        flag = false;
    	        break;
    	    }
    	}
    	
    	printf(flag?"yes\n":"no\n");
	}
	return 0;
}

bool judge(int start, int rule[]){
    int judge_arr[9] = {0};
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
