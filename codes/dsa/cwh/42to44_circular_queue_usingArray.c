#include<stdio.h>
#include<stdlib.h>

// whenever you increament last or first, always do CIRCULAR INCREAMENTATION.
// My observation after investing hell lot of time:
/*
- only the logic for isEmpty() and isFull() modifies.
- rest logic remains same just doing CIRCULAR INCREAMENTATION in case of last and first and their derivatives.
        => that is if you circularly added first with 1 and got say, fuck, then you have to circularly add fuck too.. if you ever need to.. as it is first's derivative
*/

typedef struct array{
    int last;
    int size;
    int first; // using of this will decrease the time complexity of dequeue --> one address before the first entry
    int *arr;
} cqueue ;

int isFull(cqueue *q);
int isEmpty(cqueue *q);
void printQueue(cqueue *q){
    if (isEmpty(q) == 0) {
            for (int i = (q->first+1)%q->size; i <= q->last ; i++){
                printf("%d ", q->arr[i]);
            }
            printf("\n");
    }
    else {
        printf("Queue is empty:/\n");
    }
}

void enqueue(cqueue *q, int val){
    if (isFull(q) == 0){
    q->last = (q->last+1)%q->size; // *******>>>> circular increament !!!
    q->arr[q->last] = val;
    }
    else {
        printf("Queue is full now..\n");
    }
}

void dequeue(cqueue *q){
    if ( isEmpty(q) == 0 ){
    q->first = (q->first+1)%q->size; // *******>>>> circular increament !!!
    q->arr[q->first] = 0; // garbage value.
    }
    else {
        printf("Queue is empty..\n");
    }
}

int firstVal(cqueue *q){
    if ( isEmpty(q) == 0 ){
        return q->arr[(q->first+1)%q->size]; // *******>>>> circular increament !!!
    }
    return 0; // garbage value
}

int lastVal(cqueue *q){
    if ( isEmpty(q) == 0 ){
    return q->arr[q->last];
    }
    return 0; // garbage value
}

int peek(cqueue *q, int index){
    if ( isEmpty(q) == 0){
        int pos = (index+(q->first+1)%q->size)%q->size; // *******>>>> circular increament !!
        // ((index+1)+q->first)%q->size means the same.
        return q->arr[pos];
    }
    else {
        printf("Queue is empty:/\n");
        return 0;
    }
}

int isFull(cqueue *q){
    if (q->last == q->first && q->arr[q->last] != 0 ){ // tho the array isn't full yet, but according to logic nothing  
                                                       // can be pushed into the cqueue. [0 is the garbage value]
        return 1;
    }
    else if (q->first == -1 && q->last == q->size-1){
        return 1;
    }
    return 0;
}

int isEmpty(cqueue *q){
    if (q->last == q->first && q->arr[q->last] == 0){
        return 1;
    }
    else if(q->last == q->first && q->last == -1){
        return 1;
    }
    return 0;
}

int main(){
    
    cqueue *cqdt = (cqueue *)malloc(sizeof(cqueue));
    cqdt->arr = (int *)malloc(sizeof(int));
    cqdt->first = -1;
    cqdt->last = -1;
    cqdt->size = 5;

    enqueue(cqdt, 6);
    printQueue(cqdt);
    enqueue(cqdt, 4);
    printQueue(cqdt);
    enqueue(cqdt, 7);
    printQueue(cqdt);
    enqueue(cqdt, 5);
    printQueue(cqdt);
    enqueue(cqdt, 9);
    printQueue(cqdt);
    enqueue(cqdt, 1);
    printQueue(cqdt);


    dequeue(cqdt);
    printQueue(cqdt);
    dequeue(cqdt);
    printQueue(cqdt);
    dequeue(cqdt);
    printQueue(cqdt);
    dequeue(cqdt);
    printQueue(cqdt);
    dequeue(cqdt);
    printQueue(cqdt); // -- first empty output
    dequeue(cqdt); // -- second empty output

    enqueue(cqdt, 6);
    // printQueue(cqdt);
    // dequeue(cqdt);
    enqueue(cqdt, 4);
    // enqueue(cqdt, 5);
    printQueue(cqdt);

    printf("First value in queue is %d.\n", firstVal(cqdt));
    printf("Last value in queue is %d.\n", lastVal(cqdt));

    enqueue(cqdt, 7);
    enqueue(cqdt, 5);
    enqueue(cqdt, 9);
    enqueue(cqdt, 1);
    printQueue(cqdt);

    printf("First value in queue is %d.\n", firstVal(cqdt));
    printf("Last value in queue is %d.\n", lastVal(cqdt));
    printf("Value at %d in queue is %d.\n", 2,peek(cqdt, 2));

    return 0;
}