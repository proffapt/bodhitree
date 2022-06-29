#include<stdio.h>
#include<stdlib.h>

void twosum(int *nums , int numsSize , int target , int returnSize[]){

    for(int i=0 ; i<numsSize ; i++){
        for(int j=i+1 ; j<numsSize; j++){
            if(nums[i]+nums[j]==target){
               	returnSize[0]=i;
               	returnSize[1]=j;
            }
        }
    }
}

int main(){
    int numsSize;
    int target;
    int returnSize[2];

    printf("Enter NumsSize : ");
    scanf("%d",&numsSize);
    int nums[numsSize];

    for(int i=0 ; i<numsSize ; i++){
        scanf("%d",&nums[i]);
    }

    printf("Enter Target : ");
    scanf("%d",&target);

    twosum(nums, numsSize, target, returnSize);

    printf("[");
    for(int i=0; i<2 ; i++){
        printf("%d, ",returnSize[i]);
    }
    printf("\b\b]\n");

    return 0;
}
