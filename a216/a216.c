#include <stdio.h>

//f 可以用梯形公式處理
//注意 int 和 long 的範圍
//注意 long 的printf 形式

int main(void) {
	
	int i, n;
	long f, g;
	
	while (scanf("%d", &n) != EOF) {
	    f = 1;
	    g = 1;
	    
	    for (i = 2; i <= n; i++) {
	        f = f + i;
	        g = g + f;
	    }
	    
	    printf("%ld %ld\n", f, g);
	}
	
	
	return 0;
}

