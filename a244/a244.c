#include <stdio.h>

int main() {
    int n, a;
    long long int b, c;
    while (scanf("%d", &n) !=EOF) {
        for (int i = 0; i < n; i++) {
            scanf("%d %lld %lld", &a, &b, &c);
            switch (a) {
                case 1:
                    printf("%lld\n", b + c);
                    break;
                case 2:
                    printf("%lld\n", b - c);
                    break;
                case 3:
                    printf("%lld\n", b * c);
                    break;
                case 4:
                    printf("%lld\n", b / c);
                    break;
            }
        }
    }
    
}
