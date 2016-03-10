#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int fibonacci(int input);
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int input, i;
    scanf("%d", &input);
    printf("%d", fibonacci(input));
    return 0;
}

int fibonacci(int input){
    if(input <= 1){
        return input;
    }
    return fibonacci(input-1) + fibonacci(input-2);
}
