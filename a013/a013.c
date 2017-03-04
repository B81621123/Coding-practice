#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int rome_to_int(char* str);
void int_to_roma(int n, char* str);

int main() {
    char a[100] = {0};
    char b[100] = {0};
    while(scanf("%s",&a) != EOF){
        if (strcmp(a, "#") == 0) break;
        scanf("%s", b); 
        int difference = abs(rome_to_int(a) - rome_to_int(b));
        char output[100] = {0};
        int_to_roma(difference, output);
        difference == 0?printf("ZERO\n") : printf("%s\n", output);
    }
    return 0;
}

int rome_to_int(char* str) {
    int n = 0;
    int pre = 0;
    int value = 0;
    for (int i = strlen(str);i >= 0;i--) {
        switch (str[i]) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
        }
        if (value < pre) {
            n -= value;
        } else {
            n += value;
        }
        pre = value;
    }
    return n;
}

void int_to_roma(int n, char* str) {
    int iarr[13] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    char *sarr[13] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    char *(*ptr)[13] = &sarr;
    
    for (int i = 0;i < 13 && n > 0; i++) {
        char* s = (*ptr)[i];
        while(n >= iarr[i]){
            n -= iarr[i];
            strncpy(str, s, strlen(s));
            str += strlen(s);
        }
    }    
}
