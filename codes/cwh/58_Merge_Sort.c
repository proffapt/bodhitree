#include<stdio.h>

// Merging into  different array.
/* void merge(int a[], int b[], int c[], int n, int m){ */
/* 	int i=0, j=0, k=0; */
/* 	while(1){ */
/* 		if(a[i]<b[j]){ */
/* 			c[k]=a[i]; */
/* 			k++; i++; */
/* 		} */
/* 		else{ */
/* 			c[k]=b[j]; */
/* 			k++; j++; */
/* 		} */
/* 		if(i==n || j==m){ */
/* 			if(i!=n){ */
/* 				c[k]=a[i]; */
/* 				k++; i++; */
/* 			} */
/* 			if(j!=m){ */
/* 				c[k]=b[j]; */
/* 				k++; j++; */
/* 			} */
/* 		} */
/* 		if(i==j && j==m) break; */
/* 	} */
/* } */

// Merging in the same array, efficient usage of space
void merge(int a[], int l, int m, int h){
	int i=l, j=m+1, k=l, c[h+1]; // notice why k is initialised with l, because in every intermediate array, l is the beginning
	while(i<m+1 && j<h+1){
		if(a[i]<a[j]){
			c[k]=a[i];
			++i, ++k;
		}
		else{
			c[k]=a[j];
			++j, ++k;
		}
	}
	// copying remaining elements
	while(i<m+1){
		c[k]=a[i];
		++i, ++k;
	}
	while(j<h+1){
		c[k]=a[j];
		++j, ++k;
	}
	// copying everything from c to a
	for(i=l; i<h+1;i++) a[i]=c[i];
}

void mergeSort(int a[], int l, int h){
	int m;
	if(l<h){
		m=(l+h)/2;
		mergeSort(a, l, m);
		mergeSort(a, m+1, h);
		merge(a, l, m, h);
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
	mergeSort(array, 0, 6);
	printf("The array after sorting: ");
	display(array, 7);

	return 0;
}
