#include<stdio.h>

int main(){
	char input;
	int integer=0, k=0, minus_tha=0, check[100]={}, yet_another_checker=0;

	printf("Enter an integer please: ");
	do{
		scanf("%c", &input);
		if(input<='9' && input>='0') {
			integer=integer*10+(input-'0');
			check[k]++;
			k++;
		}
		else if(input=='-'){
			check[0]++;
			minus_tha=1;
			k++;
		}
		else {
			k++;
		}

		if(input=='\n') break;

	} while(1);
	for (int i=0; i<k-1; i++){
		if (check[i]==1){
			yet_another_checker++;
		}
	}
	if (yet_another_checker==k-1){
		if(minus_tha) integer=integer*(-1);
		printf("The integer you entered was: %d\n", integer); 
		return 0;
	}

	printf("Pyar se samajh nahi ara integer dena hai??\n");

	return 1;
}
