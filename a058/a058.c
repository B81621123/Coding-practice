#include <stdio.h>

int main() {
    int n, num;
    
    while (scanf("%d", &n) != EOF) {
        int iarr[3] = {0};
        while (n > 0) {
            scanf("%d", &num);
            iarr[num%3]++;
            n--;
        }
        
        printf("%d %d %d\n", iarr[0], iarr[1], iarr[2]);
    }
    
    
    return 0;
}
