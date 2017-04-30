#include <stdio.h>

int main () {
    int n, temp;
    double sum;
    while (scanf("%d", &n) != EOF) {
        sum = 0;
        for (int i = 0; i < n; i++) {
            scanf("%d", &temp);
            sum += temp;
        }
        printf((double)sum/n > 59?"no\n":"yes\n");
    }
    return 0;
}
