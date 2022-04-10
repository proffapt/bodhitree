#include<stdio.h>
#include<stdlib.h>

// *********** IMPORTANT POINTS ABOUT THIS IMPLEMENTATION **************
/*
- head is chosen as the top pointer, other wise going to the last link will take eternity for big lists.
- stack developed from this idea has size limit equal to your HEAP MEM SIZE(dynamically allocated).
        * Thus always useful to set a custom size.
- stack will be empty when top will refer to NULL.
*/

// This linked list will act as stack now...
typedef struct node{
    int data;
    struct node *next; // can't use typdef name inside this block.. for obvious reasons :shrug
} stack ;
// to store the changes persistently
stack *newHEAD;

void displayStack(stack *ptr){
    while( ptr != NULL){
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
    printf(".\n");
}

// int stackSize(stack *top){
//     int end =1;
//     stack *ptr = top;
//     while (ptr->next != NULL){
//         ptr = ptr->next;
//         end++;
//     }
//     return end;
// }

// void peek(stack *top, int index){
//     if ( 1 <= index && index <= stackSize(top) ){
//         stack *ptr = top;
//         for (int i = 1; i < index ;i++){
//             ptr = ptr->next;
//         }
//         printf("The data at index %d is %d.\n", index, ptr->data);
//     }
//     else {
//         printf("Specified index value is out of domain of the stack");
//     }
// }

// better logic

void peek(stack *top, int index){
    stack *ptr = top;
        for (int i = 1; i < index && ptr != NULL ;i++){
            ptr = ptr->next;
        }
    if ( ptr != NULL ){
        printf("The data at index %d is %d.\n", index, ptr->data);
    }
    else {
        printf("Specified index value is out of domain of the stack");
    }
    
}

int isFull(stack *top);
void push(stack *top, int val){
    if (isFull(top) == 0){
        stack *ptr = (stack *)malloc(sizeof(stack));
        ptr->data = val;
        ptr->next = top;
        top = ptr;
        printf("Pushed %d.\n", val);
        newHEAD = top;
        displayStack(top);
    }
    else {
        printf("Can't push any more, the stack is full !");
    }
}

int isEmpty(stack *top);
void pop(stack *top){
    if (isEmpty(top) == 0){
    stack *ptr = top;
    top = top->next;
    printf("Popped %d.\n", ptr->data);
    free(ptr);
    newHEAD = top;
    displayStack(top);
    }
    else {
        printf("Can't pop any more, the stack is Empty !");
    }
}

void stackTop(stack *top){
    printf("%d is at the top of the stack.\n", top->data);
}

void stackBottom(stack *top){
    stack *ptr = top;
    while ( ptr->next != NULL ){
        ptr = ptr->next;
    }
    printf("%d is at the top of the stack.\n", ptr->data);
}

int isEmpty(stack *top){
    if ( top == NULL ){
        return 1;
    }
    return 0;
}

// important logic
int isFull(stack *top){
    stack *test = (stack *)malloc(sizeof(stack));
    if ( test == NULL ){
        return 1;
    }
    return 0;
}

int main(){

    // Implementation:
    stack *head, *second, *third, *fourth, *fifth;
    head = (stack *)malloc(sizeof(stack));
    second = (stack *)malloc(sizeof(stack));
    third = (stack *)malloc(sizeof(stack));
    fourth = (stack *)malloc(sizeof(stack));
    fifth = (stack *)malloc(sizeof(stack));
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
    displayStack(head);

    //pushing
    push(head, 5);

    //popping
    pop(newHEAD);
    pop(newHEAD);

    stackTop(newHEAD);
    stackBottom(newHEAD);

    peek(newHEAD, 3);
    pop(newHEAD);
    peek(newHEAD, 3);

    return 0;
}