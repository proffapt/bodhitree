#include<stdio.h>
#include<stdlib.h>

void display(int arr[], int size){ 
    for(int i = 0; i<size; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");
}

void insert(int arr[], int in_index, int in, int size, int cap){ // Why arr[]???????? -- To tell  that it's an array of integers not just a single integer (int arr)
    if (in_index > cap){
        printf("ERROR: entered index is out of the capacity domain of array");
    }
    for(int i = size-1; i > size-3; i--){
        arr[i+1] = arr[i];
    }
    arr[in_index] = in;
}

void delete(int arr[], int del_index, int size, int cap){
    if (del_index > size){
        printf("ERROR: The entered index has no value in it, can't delete");
    }
    for (int i = del_index; i < size-1 ; i++){
        arr[i] = arr[i+1];
    }
    arr[size-1] = 0;
}

int main(){
    
    int size = 5, cap = 10;
    int arr[10] = {7, 8, 12, 27, 88};
    printf("Displaying original array..\n");
    display(arr, size); // Why using arr?? -- that's how we pass array to function as argument..
    int in = 69, in_index = 3;
    printf("Inserting %d into the index number %d.\n", in, in_index);
    insert(arr, in_index, in, size, cap);
    size += 1;
    display(arr, size);
    int del_index = 4;
    printf("Deleting the value at index %d from the array..\n", del_index);
    delete(arr, del_index, size, cap);
    size -= 1;
    display(arr, size);

    return 0;
}