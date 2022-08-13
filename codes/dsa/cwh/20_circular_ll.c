#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

void display(struct node *ptr){
    struct node *head = ptr;
    // DO-WHILE for kickstart!
    if ( ptr == NULL ){
        printf("The index you are trying to modify doesn't exist in scope of the linked list!");
    }
    else {
    do { printf("%d ", ptr->data);
         ptr = ptr->next;
    } while( ptr != head);
    }
    printf("\n");
}

struct node *insert(struct node *start, struct node *in, int pos){
    struct node *error = NULL;
    struct node *ptr = start;
    int end = 1;
    do { ptr = ptr->next;
         end++;
    } while( ptr->next != start );
    ptr = start;

    if ( pos == 1 ){
        do { ptr = ptr->next;
        } while( ptr->next != start );
        ptr->next = in;
        in->next = start;
        return in;
    }
    else if ( 1 < pos && pos <= end ){
        for(int i = 0; i < pos-2; i++){
            ptr = ptr->next;
        }
        in->next = ptr->next;
        ptr->next = in;
        return start;
    }
    else {
        return error;
    }
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
    fifth->next = head;
    display(head);

    struct node *ele1 = (struct node *)malloc(sizeof(struct node));
    ele1->data = 444;
    struct node *ele2 = (struct node *)malloc(sizeof(struct node));
    ele2->data = 777;
    struct node *ele3 = (struct node *)malloc(sizeof(struct node));
    ele3->data = 999;
    struct node *in1 = insert(head, ele1, 1);
    struct node *in2 = insert(in1, ele2, 1);
    struct node *in3 = insert(in2, ele3, 1);
    display(in3);

    return 0;
}