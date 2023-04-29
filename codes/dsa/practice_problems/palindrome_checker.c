#include<stdio.h>

int main(){
	int n, i, digits=0; 
	printf("Enter the number to check for palindrome: "); scanf("%d", &n);
	int t_n=n;
	
	for(i=0; t_n!=0; i++){
		t_n/=10;
		digits++;
	} 

	int t_n_r=n, t_n_l=n;
	int right_num, left_num, is=1;
	for(i=1; i<=digits/2; i++){
		int pot=1;
		for(int pow=digits-i; pow!=0; pow--) pot*=10;
					
		right_num=t_n_r%10;
		t_n_r/=10;
		left_num=t_n_l/pot;
		t_n_l-=left_num*pot;

		if(left_num!=right_num){
			printf("Not a palindrome.\n");
			is=0;
			break;
		}
	}
	if(is) printf("Is a palindrome.\n");

	return 0;
}
