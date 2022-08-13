#include<stdio.h>
#include<stdlib.h>

typedef struct stack_using_array {
    int size;
    int top;
    int *arr; // We will be making our stack memory specific, such that it consumes only required 
              // amount of memory, thus using dynamic mem alloc to create an array of memory in HEAP.
} stack ; // typedef, so that i don't have to write struct stack_using_array, stack will be enough.

void display(stack *a){
    for (int i = 0; i <= a->top; i++){
        printf("%d ", a->arr[i]);
    }
    printf("\n");
}

int isFull(stack *a); // Explicit declaration that this function exist.

void push(stack *a, int val){
    if ( isFull(a) == 0 ){
    a->top += 1;
    a->arr[a->top] = val;
    }
    else {
        printf("Sorry, the stack is FULL!\n");
    }
}

int isEmpty(stack *a);

int pop(stack *a){
    if ( isEmpty(a) == 0 ){
        a->arr[a->top] = 0;
        // free(a->arr[a->top]); // I can't free this memory since malloc creates a single memory chunk in HEAP.
        a->top -= 1;
        return 1;
    }
    else {
        printf("The stack is Empty! you can't pop anymore.");
        return 0;
    }        
}

void peek(stack *a, int index){
    if( 0 <= index && index <= a->size-1){
        printf("The value at index %d is %d.\n", index, a->arr[index-1]);
    }
    else {
        printf("This index is out of the domain of stack.\n");
    }
}

int stackTop(stack *s){
    return s->arr[s->top];
}

int stackBottom(stack *b){
    return b->arr[0];
}

int isFull(stack *a){
    if ( a->top == a->size-1 ){
        return 1;
    }
    else {
        return 0;
    }
}

int isEmpty(stack *a){
    if( a->top == -1 ){
        return 1;
    }
    else {
        return 0;
    }
}

int main(){

    stack *s = (stack *)malloc(sizeof(stack));
    s->size = 5;
    s->top = -1;
    s->arr = (int *)malloc(s->size*sizeof(int));

    push(s, 4);
    push(s, 69);
    push(s, 5);
    push(s, 78);
    push(s, 90);
    display(s);

    push(s, 23); // can't be added into the stack

    peek(s, 1);
    peek(s, 4);
    peek(s, 5);

    pop(s);
    display(s);
    printf("%d is at the top value of stack and %d is the bottom value of stack.\n", stackTop(s), stackBottom(s));
    pop(s);
    display(s);
    pop(s);
    display(s);
    printf("%d is at the top value of stack and %d is the bottom value of stack.\n", stackTop(s), stackBottom(s));
    pop(s);
    display(s);
    pop(s);
    display(s); // stack is empty now.
 
    pop(s);
    display(s);


    return 0;
}