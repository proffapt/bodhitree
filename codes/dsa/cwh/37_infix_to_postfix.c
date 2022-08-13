#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct array_ADT{
    int top;
    int size;
    int *precedence;
    char *arr;
} array ;

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

void infix_to_postfix(char *exp){
    array *stack = (array *)malloc(sizeof(array));
    stack->top = -1;
    stack->size = 20;
    stack->arr = (char *)malloc(sizeof(char));
    stack->precedence = (int *)malloc(sizeof(int));

    char result[strlen(exp)];
    int result_index = 0;

    for ( int i = 0; exp[i] != '\0'; i++ ){
        if ( exp[i] == '+' || exp[i] == '-' ){
            if ( isEmpty(stack) == 1 ){
                push(stack, exp[i]);
                stack->precedence[stack->top] = 1;
            }
            else{
                for ( ; ; ){
                    result[result_index] = stack->arr[stack->top];
                    printf("%c", result[result_index]);
                    result_index++;
                    pop(stack);
                    if ( isEmpty(stack) == 1 ){
                        push(stack, exp[i]);
                        stack->precedence[stack->top] = 1;
                        break;
                    }
                }
            }
        }
        else if ( exp[i] == '*' || exp[i] == '/' || exp[i] == '%' ){
            if ( isEmpty(stack) == 1 || stack->precedence[stack->top] < 2 ){
                push(stack, exp[i]);
                stack->precedence[stack->top] = 2; 
            }
            else{
                for ( int i =0 ; ; ){
                    result[result_index] = stack->arr[stack->top];
                    printf("%c", result[result_index]);
                    result_index++;
                    pop(stack);
                    if ( isEmpty(stack) == 1 || stack->precedence[stack->top] == 1 ){
                        push(stack, exp[i]);
                        stack->precedence[stack->top] = 2;
                        break;
                    }
                }
            }
        }
        else {
            result[result_index] = exp[i];
            printf("%c", result[result_index]);
            result_index++;
        }
    }
    for ( ; isEmpty(stack) != 1; ){
        result[result_index] = stack->arr[stack->top];
        printf("%c", result[result_index]);
        result_index++;
        pop(stack);
    }
    printf("\n");

    free(stack);
}

int main(){

    char *exp = "x-y/z-k*d";
    printf("The postfix expression for '%s' is: ", exp);
    infix_to_postfix(exp);

    return 0;
}