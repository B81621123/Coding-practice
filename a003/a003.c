#include <stdio.h>

int main() {
	char *sarr[3];
	sarr[0] = "普通";
	sarr[1] = "吉";
	sarr[2] = "大吉";
	
	int a,b;
	while(scanf("%d %d",&a,&b)!=EOF){
		
		int c = (a*2+b)%3;
		printf("%s\n",sarr[c]);	
	}
	return 0;
}
