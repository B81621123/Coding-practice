#include <stdio.h>
#include <math.h>
#include <string.h>

int main() {
    int n, m;
    while(scanf("%d %d", &n, &m) != EOF) {
        int none = 1;
        for(int i = n; i <= m; i++) {
            int sum = 0;
            char str[10] = {0};
            
            int len = snprintf(str, sizeof(str) - 1 , "%d", i);
            
            for (int j = 0; j < len; j++) {
                int base = str[j] - 48;
                sum += pow(base, len);
            }
            
            if (sum == i) {
                none = 0;
                printf("%d ", i);
            }
        }
        
        printf(none == 1?"none\n":"\n");
    }
    
    return 0;
}
