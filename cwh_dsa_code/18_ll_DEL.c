#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

void display(struct node *ptr){
    while( ptr != NULL){
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
    printf("\n");
}

struct node *deletion(struct node *start, int index){
    struct node *error = NULL;
    struct node *ptr = start;
    int end =1;
    while ( ptr->next != NULL){
        ptr = ptr->next;
        end++;
    }
    ptr = start; //never forget!! 

    if ( index == 1 ){
        ptr = ptr->next;
        free(start); // freeing the memory is important while deleting.
        return ptr;
    }
    else if ( 1  < index && index <=end ) {
        for (int i = 1; i < index-1 ; i++ ){
            ptr = ptr->next;
        }
        struct node * delete = ptr->next; // pointing to the to be deleted node
        ptr->next = ptr->next->next;
        free(delete); // freeing the memory
        return start;
    }
    else {
        printf("You are trying to delete an index which doesn't even exist in this list!");
        return error;
    }
}

// ******* IDEOLOGY BEHIND FREEING DYNAMIC MEMORY *******
/*
1. Create a new pointer which specifically points to the node being deleted.
2. free(new pointer); ==> this command can be used to delete any dynamically allocated memory, even if pointed by various pointer, doesn't matter, just use any pointer --> It will delete the memory allocated.
*/

int main(){

    // Implementation:
    struct node *head, *second, *third, *fourth, *fifth;
    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    fourth = (struct node *)malloc(sizeof(struct node));
    fifth = (struct node *)malloc(sizeof(struct node));
    head->data = 1;
    head->next = second;
    second->data = 69;
    second->next = third;
    third->data = 34;
    third->next = fourth;
    fourth->data = 56;
    fourth->next = fifth;
    fifth->data = 25;
    fifth->next = NULL;
    display(head);

    int index = -7;
    struct node *deletedll = deletion(head, index);
    display(deletedll);

    return 0;
}