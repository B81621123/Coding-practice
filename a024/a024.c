#include<stdio.h>

int main() {
    int a, b;
    while (scanf("%d %d", &a, &b) != EOF) {
        int temp;
        while ( a % b != 0) {
            a = a % b;
            temp = b;
            b = a;
            a = temp;
        }
        
        printf("%d\n", b);
    }
    
    return 0;
}
