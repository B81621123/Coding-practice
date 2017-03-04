#include <stdio.h>
#include <string.h>



// swap the values in the two give variables
// XXX: fails when a and b refer to same memory location
#define XOR_SWAP(a, b) do\
    {\
        a ^= b;\
        b ^= a;\
        a ^= b;\
    } while (0)
    
void reverse(char *str);
int main() {
    char str[9999] = {0};
    
	while (scanf("%s", &str) != EOF) {
        reverse(str);
        char* output = str;
        while(*output == '0') {
            output++;
        }
        
        if(strlen(output) > 0) {
            printf("%s\n", output);
        } else {
            printf("0\n");
        }
	}
	return 0;
}

void reverse(char *str) {
    if (str) {
        char *end = str + strlen(str) -1;
        
        while(str < end) {
            XOR_SWAP(*str, *end);
            str++;
            end--;
        }

    }
}
