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

// Insert at beginning
// * before insert_at_beginning is added to match the "return value type"(pointer) to the function data type(struct node *)
struct node *insert_at_beginning(struct node *ptr, struct node *insert){
    insert->next = ptr; // persists, why? it modified the new->next pointer.
    ptr = insert; // not persistent, both pointers die after the function returns.
    return ptr;
}

// Insert at the end
struct node *insert_at_end(struct node *ptr, struct node *insert){
    struct node *head = ptr;
    while( ptr->next != NULL ){
        ptr = ptr->next;
    }
    ptr->next = insert; // persistent
    insert->next = NULL; // persistent
    return head;
}

//Insert in middle after specified index
struct node *insert_in_middle(struct node *ptr, struct node *insert, int index){
    if( index != 0){
        struct node *head = ptr;
        for(int i = 1; i < index-1; i++){
            ptr = ptr->next;
        }
        insert->next = ptr->next;
        ptr->next = insert;
        return head;
    }
    else{
        printf("The purpose of this function is not to modify head and end of ll.");
        return 0;
    }
}

//Insert after a node:
// All in one insert function, insert at the specified position
struct node *insert(struct node *start, struct node *insert, int pos){
    struct node *error = NULL;
    struct node *ptr = start;

    int end = 1;
    while( ptr != NULL){
        ptr = ptr->next;
        end++;
    }
    ptr = start;

    if( pos == 1 ){
        insert->next = start; // persistent
        start = insert; 
    }
    else if ( pos == end ){
        while( ptr->next != NULL ){
            ptr = ptr->next;
        }
        ptr->next = insert; // persistent
        insert->next = NULL; // persistent
    }
    else if ( 1 < pos && pos < end ) {
        for(int i = 1; i < pos-1; i++){
            ptr = ptr->next;
        }
        insert->next = ptr->next; // persistent
        ptr->next = insert; // persistent
    }
    else {
        printf("You have crossed the dead-end of linked list.");
        return error;
    }
    return start;
}

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

    display(head); // Why giving a pointer?? not an address??? -- Dumbass pointer variable stores an address (-_-)
    
    struct node *new = (struct node *)malloc(sizeof(struct node));
    new->data = 1000;
    new->next = NULL;
    
    struct node *iab = insert_at_beginning(head, new);
    display(iab);
    // By now new->next = head;
    // To get back the original linked list:
    new->next = NULL;

    struct node *iae = insert_at_end(head, new);
    display(iae);
    // To get back the original linked list:
    fifth->next = NULL;

    struct node *iim = insert_in_middle(head, new, 1);
    display(iim);
    // To get back the original linked list:
    head->next = new->next;
    new->next = NULL;
   
    struct node *in = insert(head, new, 7);
    display(in);

    return 0;
}