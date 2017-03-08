#include<stdio.h>
#include<math.h>

int main() {
    int t,a,b;
    
    while (scanf("%d", &t) != EOF) {
        for (int i = 1; i <= t; i++ ){
            scanf("%d", &a);
            scanf("%d", &b);
            int sum = 0;
            int j = 1;
            while (pow(j, 2) < a) {
                j++;
            }       
            
            while (pow(j, 2) <= b) {
                sum += pow(j, 2);
                j++;
            }
            
            printf("Case %d: %d\n", i, sum);
        }
    }
    
    return 0;
}
