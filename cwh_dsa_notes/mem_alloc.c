#include<stdio.h>
#include<stdlib.h>

// ***** VERY IMPORTANT ******* 
/*
 ----- DYNAMIC MEMORY ALLOCATION -----

++> `struct Node *ptr = (struct node *)malloc(sizeof(struct node));` <++

- When the function returns, the pointer "dies", but the allocated memory remains allocated.
- `(struct node *)malloc(sizeof(struct node))`:: Will allocate new memory on the HEAP for an object of type Node[with help of struct], where it will remain until you manually deallocate it using free(). If you don't retain a reference to it, then you can't deallocate it and you have a memory leak.
- `struct Node *ptr`:: Will create a pointer of type Node[with help of struct] on the STACK until it goes out of scope (in this case, when the function returns), initializing it to reference the object you just created.

- Memory can be freed during run-time using free().

 ----- STATIC MEMORY ALLOCATION ----

++> `int marks = 6;`<++

- marks is the object in STACK, referencing to memory containing the value 6, survives till the scope.
- Memory block may not be over-written, or maybe overwritten.
- &marks is the pointer of type int on the STACK until it goes out of scope (in this case, when the function returns).

- Memory can't be freed during run-time, it is allocated during compile-time.

*/

// Declaring global pointers:
    int *ptr1;
    int *ptr2;

void function(){

    int *dptr = (int *)malloc(sizeof(int)); // dynamic memory allocation
    int marks; // static memory allocation

    *dptr = 13; // dptr pointing at memory location in HEAP containing 13.
    marks = 69; // &marks pointing at memory location in STACK containing 69.

    // since dptr and &sptr will both die after the function ends.
    // thus also pointing the memories of them through global pointers.

    // pointer ke saath chhedkhaani persistent rehti hai.
    ptr1 = dptr; // ptr1 pointing at memory location in HEAP containing 13. 
    ptr2 = &marks;

    printf("Printing from inside the function: \n");
    printf("Printing some addresses:\n dptr = %p, &sptr = %p, ptr1 = %p, ptr2 = %p\n", dptr, &marks, ptr1, ptr2);
    printf("Using fun_scoped pointers: %d, %d.\n", *dptr, marks);
    printf("Using global_scoped pointers: %d, %d. \n", *(ptr1), *ptr2);
    printf("\n");
    // free(dptr);
}

// Expected output is:
// [x] Both the pointers dptr and &sptr die as the function ends, ptr1 and ptr2 still persist.
// [ ] *dptr( = *ptr1) is still there, as it's in HEAP, sptr( = *ptr2) is gone as it's in STACK scope of the function.

int main(){

    function();
    printf("Printing from outside the function: \n");
    printf("Printing some addresses:\n ptr1 = %p, ptr2 = %p\n", ptr1, ptr2);
    // printf("Using fun_scoped pointers: %d, %d.\n", *dptr, marks);
    printf("Using global_scoped pointers: %d, %d. \n", *(ptr1), *ptr2);

    return 0;
}