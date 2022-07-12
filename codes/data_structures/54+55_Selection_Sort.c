#include<stdio.h>

void printArray(int *A, int n)
{
	for (int i = 0; i < n; i++)
	{
		printf("%d ", A[i]);
	}
	printf("\n");
}

void selectionSort(int *A, int n) 
{
	int min, k;
	for (int i = 0; i<=n-2; i++)
	{	
		min = A[i];
		for (int j = i+1; j<=n-1; j++)
		{
			if(A[j] < min)
			{
				min = A[j];
				k = j;
			}				
		}
		if( min != A[i])
		{
			A[i] = A[i] + A[k];
			A[k] = A[i] - A[k];
			A[i] = A[i] - A[k];
		}
	}
}

int main()
{
	int A[] = {23, 45, 12, 34, 78, 23, 56};
	int size = 7;

	printArray(A, size);
	selectionSort(A, size);
	printArray(A, size);

	return 0;
}