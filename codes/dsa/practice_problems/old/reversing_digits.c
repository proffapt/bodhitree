#include<stdio.h>

int main()
{
	int n, reversed=0, remainder;
	printf("Enter an integer: "); scanf("%d", &n);

	while(n!=0){
		remainder=n%10;
		reversed = reversed*10 + remainder;
		n/=10;
	}
	printf("The reversed number is: %d\n", reversed);

	return 0;
}
