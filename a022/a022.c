#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool palindrome(char* str);

int main() {
    char str[1000];
    while(scanf("%s", &str) != EOF) {
        printf("%s\n", palindrome(str)?"yes":"no");
    }
	return 0;
}

bool palindrome(char* str) {
    
    int len = strlen(str);
    
    for (int i = 0; i < (len+1)/2; i++) {
        if (str[i] != str[len-1-i]) {
            return false;
        }
    }
    return true;
}
