#include <stdio.h>

int main() {
	int n, m, sum, count;
	
	while(scanf("%d %d", &n, &m) != EOF) {
	    sum = n;
	    n++;
        for (count = 1; sum <= m; n++){
            count++;
            sum += n;
        }	    
        printf("%d\n", count);
	}
	
	return 0;
}
