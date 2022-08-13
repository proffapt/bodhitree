#include<stdio.h>
#include<stdlib.h>

struct Node {
    int data;
    struct Node *next;
};

int main() {
    
    //Implementation
    struct Node *head, *second, *third; // *means that i am creating a pointer named head.
    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    third = (struct Node*)malloc(sizeof(struct Node));

    head->data = 4;
    head->next = second;
    second->data = 6;
    second->next = third;
    third->data = 11;
    third->next = NULL;

    //Traversal
    struct Node *ptr;
    ptr = head;
    while(ptr != NULL){
        printf("The value at node is %d.\n", ptr->data);
        ptr = ptr->next;
    }

    return 0;
}
