#include<stdio.h>
#include<stdlib.h>

// This below implementation of linked list will be treated as queue..
typedef struct linkedList{
    int data;
    struct linkedList *next;
} queue;

    queue *front = NULL;
    queue *end = NULL;

int isEmpty(queue *front);
void display(queue *front){
    if (isEmpty(front) == 0){
        queue *ptr = front;
        while ( ptr != NULL ){
            printf("%d ", ptr->data);
            ptr = ptr->next;
        }
        printf("\n");
    }
    else {
        printf("Queue is empty :/\n");
    }
}

int isFull(queue *front);
void enqueue(int val){ // no need to give front and end as inputs (they will become new variables, which will be local to this functino), that will change priority to these local variables rather than to the global ones...
    if ( isFull(front) == 0 ){
        queue *new = (queue *)malloc(sizeof(queue));
        new->data = val;
        new->next = NULL;
        // This is to handle an extra case when queue will be empty
        if ( isEmpty(front) == 1 ){
            // printf("Adding first entry\n");
            front=end=new; 
        }
        else {
            // printf("Adding to non-empty queue\n");
            end->next = new; // persistent change.
            end = new; // persitent because of making end as global variable..
        }
    }
    else {
        printf("Can't add anymore, queue is full!!\n");
    }
}

void dequeue(void){
    if (isEmpty(front)==0){
        queue *ptr = front;
        front = front->next;
        free(ptr); // this will be persistent, since it's free function it will delete the shit out of heap
    }
    else{
        printf("Queue is empty.. lol.. ab kya bacche ki jaan lega\n");
    }
}

int isEmpty(queue *f){
    if ( f == NULL ){ // when front will be null, end will also be null.
        return 1;
    }
    return 0;
}

int isFull(queue *f){
    queue *new = (queue *)malloc(sizeof(queue));
    if ( new == NULL ){ // when HEAP mem will be full
        free(new);
        return 1;
    }
    free(new);
    return 0;
}

int main(){
    //Implementation of queue
    /*
    queue *front = NULL;
    queue *end = NULL; // both indicating empty linked list.

    display(front); 
    front = enqueue(front, end, 6);
    end = front; // was done in the function but that wasn't persistent..
    display(front);

    front = enqueue(front, end, 5);
    display(front);
    */

    // Now to fix this persistence problem you can either make the function to return out the front pointer, and print the queue [to see and feel what I am talking about look at 14_ll_INS.c], but the catch with this is still I will have to do some modifications which were done by the fucntion but to a temporary variable [as done in the suggested code file] and this time one more issue, i need to modify two pointers, can't get two returns from one function...
    // The other method to fix this is making front and end global pointers.. by this the function will modify those global variables instead of modifying their copies..
    printf("-------changing the methodology--------\n");

    display(front);
    enqueue(2);
    enqueue(4);
    enqueue(9);
    enqueue(4);
    enqueue(6);
    enqueue(8);
    enqueue(0);
    enqueue(11);
    enqueue(69);
    display(front);
    
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    display(front);

    return 0;
}