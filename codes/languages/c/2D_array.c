#include<stdio.h>
#include<stdlib.h>

void getdata(int **a, int n){
	for(int i=0; i<n; i++)
		for(int j=0; j<n; j++)
			scanf("%d", &a[i][j]);
}

void printdata(int **a, int n){
	for(int i=0; i<n; i++)
		for(int j=0; j<n; j++)
			printf("%d,", a[i][j]);
	printf("\b \n");
}

int main(){
	int **twoDarray=(int **)malloc(sizeof(int *));
	for(int i=0; i<2; i++)
		twoDarray[i]=(int *)malloc(sizeof(int));
	getdata(twoDarray, 2);
	printdata(twoDarray, 2);
	return 0;
}
