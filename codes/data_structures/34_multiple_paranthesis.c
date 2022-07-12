#include<stdio.h>
#include<stdlib.h>

// logics?? >
/*
- After the end of string stack must be empty.
- Pop will occur only when the closing bracket matches most recent open bracket in the stack.
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

void multipleParanthesisMatch(char *exp){
    //initialising another stack for pushing and popping
    array *stack = (array *)malloc(sizeof(array));
    stack->size = 20;
    stack->top = -1;
    stack->arr = (char *)malloc(sizeof(char));

    int empty_before_full_traversal_OR_unmatched_paranthesis = 0;

    for ( int i = 0; exp[i] != '\0'; i++ )
    {
        if (exp[i] == '(')
        {
            push(stack, '(');
        }
        else if (exp[i] == '[')
        {
            push(stack, '[');
        }
        else if (exp[i] == '{')
        {
            push(stack, '{');
        }
        else if (exp[i] == ')')
        {
            if(stack->arr[stack->top] == '(')
            {
                pop(stack);
            }
            else
            {
                empty_before_full_traversal_OR_unmatched_paranthesis++;
                break;
            }
        }
        else if (exp[i] == ']')
        {
            if(stack->arr[stack->top] == '[')
            {
                pop(stack);
            }
            else
            {
                empty_before_full_traversal_OR_unmatched_paranthesis++;
                break;
            }
        }
        else if (exp[i] == '}')
        {
            if(stack->arr[stack->top] == '{')
            {
                pop(stack);
            }
            else
            {
                empty_before_full_traversal_OR_unmatched_paranthesis++;
                break;
            }
        }
    }

    if (isEmpty(stack) == 1 && empty_before_full_traversal_OR_unmatched_paranthesis == 0){
        printf("Paranthesis are balanced in this expression.\n");
    }
    else{
        printf("Paranthesis are NOT balanced in this expression.\n");
    }
    free(stack);
}

int main(){

    char *exp = "[67-(4/6)]{}}";
    multipleParanthesisMatch(exp);

    return 0;
}