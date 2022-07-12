#include<stdio.h>

void display(int a[], int n){
	printf("< ");
	for(int i=0; i<n; i++) printf("%d, ", a[i]);
	printf("\b\b >\n");
}

int partition(int a[], int l, int h){
	int i=l+1, j=h;
	while(i<j){
		// just opposite of what we need for swapping a[i] and a[j]
		// we need a[i]>pivot
		while (a[i]<=a[l]) i++;
		// jab jo chahiye hai nahi toh counter badhate chalo
		// just opposite of what we need for swapping a[i] and a[j]
		// we need a[j]<=pivot
		while (a[j]>a[l]) j--;
		// jab jo chahiye hai nahi toh counter badhate chalo
		// ab jab counter badhate badhate dono condition ka mel bethgya, toh swap kardo
		if (i<j){
			a[j]=a[j]+a[i];
			a[i]=a[j]-a[i];
			a[j]=a[j]-a[i];
		}
		// yahi karte raho jab tak j<i na hojaye
	}
	// jese hi j<i ho a[j] aure a[l] ko swap karo.. jo ki pivot that lekin..
	// pivot ko swap karne ki galti mat karna, pivot nahi variable ke element ko change karna hai 
	a[j]=a[j]+a[l];
	a[l]=a[j]-a[l];
	a[j]=a[j]-a[l];
	return j;
}

void quickSort(int *a, int l, int h){
	if(l<h){
		int partitionIndex=partition(a, l, h);
		quickSort(a, l, partitionIndex-1); // Sort left sub-array
		quickSort(a, partitionIndex+1, h); // Sort right sub-array
	}
}

int main(){
	int array[]={3, 1, 2, 9, 7, 1, 2, 4};	
	int size=8;
	/* int array[]={3, 1, 9, 7, 1, 2, 4}; */	
	/* int size=7; */
	printf("The array before sorting: ");
	display(array, size);
	quickSort(array, 0, size-1);
	printf("The array after sorting: ");
	display(array, size);

	return 0;
}
