#include<stdio.h>
#include<stdlib.h>

/*
int *array === int array[]

***ILLEGAL***
-------------
int arr[3];
arr = {3, 4, 5};
-------------
a[0]=1;
a[1]=4;
a[2]=5;

int arr[3];
int arr[] = {3, 4 ,5};
int arr[3] = {3, 4, 5};
int arr[4] = {}; ---> initialises all element with 0
int arr[3] = {1}; ---> {1, 0, 0}
int arr[3] = {1, 2}; ---> {1, 2, 0}
int arr[4] = {[0...2]=4, 5}; --> [4, 4, 4, 5]
arr --> pointer to first element of the array named arr
int *ptr = malloc(2*sizeof(int));
ptr[0] = 1;
ptr[1] = 2;

array is pointer, pointer is array.. lmao

*/

// array is pointer.. pointer is array.. all of these are valid
/*

   Array declare karke pointer ki tarah formal args likho.. ya pointer declare karke array ki trah formal args likho.. sab chalta hai
   and obviously pointer declare karke pointer ki trah use karoge toh kaam karega hi.. same with array.. talking about formal args..

*/
int* twosum(int nums[] , int numsSize , int target , int* returnSize){
// int* twosum(int *nums , int numsSize , int target , int returnSize[]){
// int* twosum(int *nums , int numsSize , int target , int *returnSize){
// int* twosum(int nums[] , int numsSize , int target , int returnSize[]){
    
    for(int i=0 ; i<numsSize ; i++){
        for(int j=0 ; j<numsSize; j++){
            if(nums[i]+nums[j]==target && i!=j){
                returnSize[0]=i;
                returnSize[1]=j;
            }
        }
    }
    return returnSize;
}

int main(){
    int numsSize;
    int target;

    int *returnSize;
    returnSize=malloc(2*sizeof(int));

    printf("Enter NumsSize :");
    scanf("%d",&numsSize);

    int nums[numsSize];
    for(int i=0 ; i<numsSize ; i++){
        scanf("%d",&nums[i]);
    }

    printf("Enter Target :");
    scanf("%d",&target);

    returnSize=twosum(nums,numsSize,target,returnSize);
    printf("[");
    for(int i=0; i<2 ; i++){
        printf("%d , ",returnSize[i]);
    }
    printf("\b]\n");

    return 0;
}
