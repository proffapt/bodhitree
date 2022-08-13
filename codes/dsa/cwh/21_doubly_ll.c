#include<stdio.h>
#include<stdlib.h>

struct node {
    int data;
    struct node *next;
    struct node *prev;
};

void display(struct node *ptr){
    while( ptr != NULL){
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
}

void revDisplay(struct node *ptr){
    while( ptr != NULL){
        printf("%d ", ptr->data);
        ptr = ptr->prev;
    }
}

void traverse(struct node *ptr){
    display(ptr);
    while ( ptr->next != NULL){
        ptr = ptr->next;
    }
    revDisplay(ptr);
    printf("\n");
}

int main(){

    // Implementation:
    struct node *head, *second, *third, *fourth, *fifth;
    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    fourth = (struct node *)malloc(sizeof(struct node));
    fifth = (struct node *)malloc(sizeof(struct node));
    head->prev = NULL;
    head->data = 1;
    head->next = second;
    second->prev = head;
    second->data = 69;
    second->next = third;
    third->prev = second;
    third->data = 34;
    third->next = fourth;
    fourth->prev = third;
    fourth->data = 56;
    fourth->next = fifth;
    fifth->prev = fourth;
    fifth->data = 25;
    fifth->next = NULL;
    
    traverse(head);

    return 0;
}