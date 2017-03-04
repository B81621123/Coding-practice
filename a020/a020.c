#include<stdio.h>

int main() {
	
	int iarr[26] = {10,11,12,13,14,15,16,17,34,18,19,20,21,22,35,23,24,25,
    26,27,28,29,32,30,31,33};
	char str[10];
	
	while (scanf("%s", str) != EOF) {
	
    	int a = iarr[str[0] - 65];
    	a = (a % 10) * 9 + a / 10;
    	int b =  str[9] - 48;
    	for (int i = 1; i < 9; i ++) {
    	    b += (str[9-i] - 48) * i;
    	}
    	printf("%s\n", (a+b)%10 == 0? "real ":"fake");
	}
	return 0;
}
