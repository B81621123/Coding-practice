#include <stdio.h>
#include <ctype.h>

// ctype.h tolower toupper
// &str 可以用 != '\0' 判斷尾端

int main(void) {
	int i, temp;
	char str[1001] = {0};
	
	while (scanf("%s", &str) != EOF) {
	    int iarr[26] = {0};
	    for (i = 0; str[i] != '\0'; i++) {
	        temp = toupper(str[i]) - 65;
	        if (temp >= 0 && temp <= 25) {
	            iarr[temp]++;    
	        }
	    }
	    
	    temp = 0;
	    for (i = 0; i < 26; i ++) {
	        temp += iarr[i]%2;
	    }
	    
	    printf(temp < 2? "yes !\n":"no... \n");
	}
	
	
	return 0;
}
