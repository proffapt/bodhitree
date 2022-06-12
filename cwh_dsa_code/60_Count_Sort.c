#include<stdio.h>

void countSort(int a[], int n){
	// finding the maximum in the array to be sorted
	int max=a[0], i, j;
	for(i=1; i<n; i++)
		if (a[i]>max) max=a[i];
	// initilising every element in the variable sized object with zero explicitly
	int b[max+1];
	for(i=0; i<max+1; i++) b[i]=0;
	// the tracking algorithm
	for(i=0; i<n; i++) b[a[i]]++;
	// Final implemntation
	for(i=0, j=0; i<max+1; i++){
		while(b[i]!=0){
			a[j]=i; ++j; --b[i];
		}
	}
}

void display(int a[], int n){
	printf("< ");
	for(int i=0; i<n; i++) printf("%d, ", a[i]);
	printf("\b\b >\n");
}

int main(){
	int array[]={3, 1, 9, 7, 1, 2, 4};	
	printf("The array before sorting: ");
	display(array, 7);
	countSort(array, 7);
	printf("The array after sorting: ");
	display(array, 7);

	return 0;
}
