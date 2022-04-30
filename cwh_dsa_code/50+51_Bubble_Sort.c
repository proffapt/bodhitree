#include<stdio.h>
#include<stdlib.h>

void printArray(int *A, int n){
    printf("\n");
    for(int i = 0; i < n; i++){
        printf("%d ", A[i]);
    }
    printf("\n");
}

void bubbleSort(int *A, int n){
    int temp;
    printf("Pass: ");
    for(int i = 0; i<n-1; i++){ // This is for passes..
        printf("%d.. ",i+1);
        for(int j = 0; j<n-i-1; j++){ // For probable swapping
            if(A[j]>A[j+1]){
                temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;
            }
        }
    }
}

void adaptiveBubbleSort(int *A, int n){
    int temp, sortedHai = 0;
    printf("Pass: ");
    for(int i = 0; i<n-1; i++){ // This is for passes..
        printf("%d.. ",i+1);
        sortedHai = 1; 
        for(int j = 0; j<n-i-1; j++){ // For probable swapping
            if(A[j]>A[j+1]){
                temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;
                sortedHai = 0;
            }
        }
        if(sortedHai){
            return;
        }
    }
}

int main(){
    int A[] = {23, 45, 12, 34, 78, 23, 56};
    int size = 7;

    printArray(A, size);
    // bubbleSort(A, size);
    // printArray(A, size);
    adaptiveBubbleSort(A, size);
    printArray(A, size);

    return 0;
}