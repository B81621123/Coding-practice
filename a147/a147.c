#include <stdio.h>

int main () {
    int n = 0;
    while(scanf("%d", &n) != EOF) {
        if (n == 0) {
            break;
        }
        if (n != 1) {
            printf("%d", 1);   
        }
        for (int i = 2; i < n; i++) {
            if (i % 7) {
                printf(" %d", i);
            }
        }
        printf("\n");
    }
}
