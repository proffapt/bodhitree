#include <stdio.h>

void printArray(int *A, int n)
{
	for (int i = 0; i < n; i++)
	{
		printf("%d ", A[i]);
	}
	printf("\n");
}

void insertionSort(int *A, int n)
{
	for (int i = 1; i < n; i++)
	{
		int key = A[i];
		for (int j = i - 1; j >= 0; j--)
		{
			if (A[j] > key)
			{
				A[j + 1] = A[j];
				A[j] = key;
			}
		}
	}
}

int main()
{
	int A[] = {23, 45, 12, 34, 78, 23, 56};
	int size = 7;

	printArray(A, size);
	insertionSort(A, size);
	printArray(A, size);

	return 0;
}