#include<stdio.h>
#include<stdlib.h>

typedef struct array{
    int last;
    int size;
    int first; // using of this will decrease the time complexity of dequeue --> one address before the first entry
    int *arr;
} queue ;

int isFull(queue *q);
int isEmpty(queue *q);
void printQueue(queue *q){
    if ( isEmpty(q) == 0 ){
        for (int i = q->first+1; i <= q->last ; i++){
            printf("%d ", q->arr[i]);
        }
        printf("\n");
    }
    else {
        printf("Queue is empty:/\n");
    }
}

void enqueue(queue *q, int val){
    if (isFull(q) == 0){
    q->last++;
    q->arr[q->last] = val;
    }
    else {
        printf("Queue is full now..\n");
    }
}

void dequeue(queue *q){
    if (isEmpty(q)==0){
    q->first++;
    q->arr[q->first] = -69; // garbage value.
    }
    else {
        printf("Queue is empty..\n");
    }
}

int firstVal(queue *q){
    if ( isEmpty(q) == 0 ){
        return q->arr[q->first+1];
    }
    return 0; // garbage value
}

int lastVal(queue *q){
    if ( isEmpty(q) == 0 ){
    return q->arr[q->last];
    }
    return 0; // garbage value
}

int peek(queue *q, int index){
        if ( isEmpty(q) == 0){ 
        return q->arr[index+q->first+1];
    }
    else {
        printf("Queue is empty:/\n");
        return 0;
    }
}

int isFull(queue *q){
    if (q->last == q->size-1){ // tho the array isn't full yet, but according to logic nothing can be pushed into the 
                               // QUEUE.
        return 1;
    }
    return 0;
}

int isEmpty(queue *q){
    if (q->last == q->first){
        return 1;
    }
    return 0;
}

int main(){
    
    queue *qdt = (queue *)malloc(sizeof(queue));
    qdt->arr = (int *)malloc(sizeof(int));
    qdt->first = -1;
    qdt->last = -1;
    qdt->size = 13;

    enqueue(qdt, 6);
    enqueue(qdt, 4);
    enqueue(qdt, 7);

    printQueue(qdt);

    dequeue(qdt);
    printQueue(qdt);

    printf("The value at index %d is %d.\n", 1, peek(qdt, 1));

    return 0;
}