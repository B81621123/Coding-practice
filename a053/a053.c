#include <stdio.h>

int main() {
    int n;
    
    while (scanf("%d", &n) != EOF) {
        int score = 0;
        if (n > 40) {
            score = 100;
        }
        
        if (n > 20) {
            score += n - 20;
            n = 20;
        }
        
        if (n > 10) {
            score += (n - 10) * 2;
            n = 10;
        }
        
        score += n*6;
        
        printf("%d\n", score > 100 ? 100: score);
    }
    
    return 0;
}
