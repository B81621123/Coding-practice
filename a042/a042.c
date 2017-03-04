#include <stdio.h>
#include <math.h>

int main() {
	int n = 0;
	while (scanf("%d", &n) != EOF) {
	    n = pow(n, 2) - n + 2;
	    printf("%d\n", n);
	}
	return 0;
}
