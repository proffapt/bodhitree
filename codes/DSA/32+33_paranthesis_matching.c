#include<stdio.h>
#include<stdlib.h>

// logics?? >
/*
- After the end of string stack must be empty.
- While popping, stack shall not be empty.
*/

typedef struct array_ADT{
    int top;
    int size;
    char *arr;
} array ;

void displayArray(array *a){
    for (int i = a->top; i >= 0; i--){
        printf("%c ", a->arr[i]);
    }
    printf("\n");
}

int isFull(array *a);
void push(array *a, char val){
    if ( isFull(a) == 0 ){
        a->top++;
        a->arr[a->top] = val;
    }
    else{
        printf("Sorry, the stack is FULL!\n");
    }
}

int isEmpty(array *a);
void pop(array *a){
    if ( isEmpty(a) == 0 ){
        a->arr[a->top] = 0;
        a->top--;
    }
    else {
        printf("The stack is Empty! you can't pop anymore.");

    } 
}

void peek(array *a, int index){
    if ( 1<=index && index<a->size ){
        printf("The value at index %d is %d.\n", index, a->arr[index-1]);
    }
    else {
        printf("This index is out of the domain of stack.\n");
    }
}

int isFull(array *a){
    if ( a->top == a->size-1 ){
        return 1;
    }
    else {
        return 0;
    }
}

int isEmpty(array *a){
    if( a->top == -1 ){
        return 1;
    }
    else {
        return 0;
    }
}

void paranthesisMatch(char *exp){
    //initialising another stack to push and pop
    array *storage = (array *)malloc(sizeof(array));
    storage->size = 20;
    storage->top = -1;
    storage->arr = (char *)malloc(sizeof(char));

    int empty_before_full_traversal = 0;
    for ( int i = 0; exp[i] != '\0'; i++ )
    {
        if (exp[i] == '(')
        {
            push(storage, '(');
        }
        else if (exp[i] == ')')
        {
            if(isEmpty(storage)==0)
            {
                pop(storage);
            }
            else 
            {
                empty_before_full_traversal++;
                break;
            }
        }
    }
    if (isEmpty(storage) == 1 && empty_before_full_traversal == 0){
        printf("Paranthesis are balanced in this expression.\n");
    }
    else{
        printf("Paranthesis are NOT balanced in this expression.\n");
    }
    free(storage);
}

int main(){

    char *exp = "5*6(4/6)90909090((()))";
    paranthesisMatch(exp);

    return 0;
}