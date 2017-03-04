#include <stdio.h>

int main() {
	int row = 0;
	int column = 0;
	while(scanf("%d %d", &row, &column) != EOF){
	    int iiarr[row][column];
	    for (int i = 0;i < row;i++) {
	        for (int j = 0;j < column;j++) {
	           scanf("%d", &iiarr[i][j]);
	        }
	    }
	    
	    for (int i = 0;i < column;i++) {
	        for (int j = 0;j < row -1;j++) {
	           printf("%d ", iiarr[j][i]);
	        }
	        printf("%d\n", iiarr[row -1][i]);
	    }
	}
	return 0;
}
