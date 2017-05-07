#include <stdio.h>

int main () {
    int a, b, N;
    
    while (scanf("%d %d %d", &a, &b, &N) != EOF) {
        printf("%d.", a/b);
        while (N > 0;) {
            N --;
            a %= b;
            a *= 10;
            printf("%d", a/b);
        }
        printf("\n");
    }
    return 0;
}
