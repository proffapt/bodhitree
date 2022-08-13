#include<stdio.h>

int linearSearch(int arr[], int element, int size){
    for (int i = 0; i < size; i++){
        if(arr[i] == element){
            return i;
        }
    }   
    return -1;
}

int binarySearch(int arr[],int element, int size){
    
    int low, mid, high;
    low = 0;
    high = size-1;
    while(low<=high){
    mid = (low+high)/2;
       if(arr[mid]==element){
            return mid;
       } 
       else if(arr[mid] > element){
            high = mid-1;
       }
       else{
           low = mid+1;
       }
    }

    return -1;
}

int main(){

    int arr[] = {2,3,5,6,8,9,67,112,345,667};
    int size = sizeof(arr)/sizeof(int);
    int element = 67;
    int lpos = linearSearch(arr, element, size);
    printf("The %d element was found at index %d, using LINEAR Search..\n", element, lpos);
    int bpos = binarySearch(arr, element, size);
    printf("The %d element was found at index %d, using BINARY Search..\n", element, bpos);
    
    return 0;
}