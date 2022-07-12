#include<iostream>
// Revisiting Pointers...

/* 
************************************************

& operator
    --> address of / referencing operator. (When used in front of variable.. both combined together gives address of that variable in memory.)
* operator
    --> deaddressing / dereferencing operator. (When used with a pointer.. throws out the value of the variable.. to which that pointer is pointing.. or to the value stored at that address)
    --> When used with a data type.. then it is used to assign a particular type of variable as a pointer
        ## Valid syntaxes for defining ##
            ~ int* ptr = &var;
            ~ int *ptr = &var;
            ~ int * ptr = &var;

************************************************

 * Pointer to a Pointer (storing the address of that pointer variable which itself stores the address to  another variable.) 
        int** c = &(ptr);
*/

int main(){
// declaring pointers for normal data types.. has only two methods one is without new and the other is with new (the operator)

    int a = 4;
    int* ptr = &a;

// NEW operator...
    int* p = new int(69); // dynamic allocation of memory with pointer
    /*
    The new operator requests for the memory allocation in heap. If the sufficient memory is available, it initializes the memory to the pointer variable and returns its address.

    It is used for pointing / referencing to a dynamic variable.. it is a variable which is only created when there is enough memory
    */

    std::cout<< "Address of a is "<< &a<< std::endl; // p == &a
    std::cout<< "The value at address p is "<< *p<< std::endl; // a == *p

// Combining arrays and the concept of pointer...

/*
The assignment of array with pointer is quite different as with that of other data types.. so don't mix both of these.

There are a few ways in which you can combine pointers with arrays, syntax for this to achieve are as follows:
*/

// Method 1:
    int arr1[4] = {1, 2, 3, 4};
    int* parr1 = arr1; // ---> It means to store the address of the first element of arr in ptr

// Method 2:
    int arr2[4] = {5, 6, 7, 8};
    int* parr2 = &arr2[0]; // This teaches us that '&arr' has no significance.. arr[0] is stored in a memory block.. you can't say that arr is stored in a memory block.. thus.. arr[0] has an address( == parr .. duhh).. but not arr.
    // What i want to say is that we use pointer to store address of the starting of array.. there is no concept as such as address of an array.
 
// +++++++++++++++ ABOVE TWO ARE EXACTLY SAME... THEY MEAN THE SAME THING! +++++++++++++++++++++

// Method 3:
//++++++++++ This basically is called dynamic allocation ++++++++++
    int* parr3 = new int[4]; 

// Method 4:
// Using "array name" without the brackets.. as pointer..
    int arr3[4] = {9, 10, 11, 12};
    std::cout<< "Using array name as pointer.. "<< std::endl;
    for (int i = 0; i<3; i++){
        std::cout<< arr3 + i<< ", "; // no need to declare a pointer explicitly just use the name of array as pointer..
    }
    std::cout<< arr3 + 3<< std::endl;

// Method 5:
// Another method of creating array of pointers..

    int* ptrarray[5];

// *************************************** random testing **********************************************

    int arr[4];
    int* parr = arr;
    // int* parr = new int[4];
    parr[0] = 34;
    parr[1] = 22;
    parr[2] = 23;
    parr[3] = 96;
    // Since you can use name of array (without braces) as pointer, thus by the law of reversibility you can use name of pointer(with braces) as array elements.

    std::cout<< "method 1:"<< std::endl;
    for (int i = 0; i<=3; i++){
        std::cout<< *(parr + i)<< std::endl; // parr == &arr[0].. then comes pointer arithematic.. here it means.. new address = old address + i * size of individual entry(in this case int data type.. which has 4 bits)
    }

    std::cout<< "Printing address of each and every stored entry:"<< std::endl;
    for (int i = 0; i<=3; i++){
        std::cout<< (parr + i) << std::endl;
    }

    std::cout<< "Printing address of each and every stored entry using array name as pointer:"<< std::endl;
    for (int i = 0; i<=3; i++){
        std::cout<< (arr + i) << std::endl;
    }

/*
Thus more better realisation leads to

ptr + i is equivalent to &arr[i]; 
*(ptr + i) == arr[i];
*/

    std::cout<< "method 2:"<< std::endl;
    for (int i = 0; i<=3; i++){
        std::cout<< parr[i]<< std::endl; // parr[i] == arr[i]
    }

    std::cout<< "method 3:"<< std::endl;
    for (int i = 0; i<=3; i++){
        std::cout<< arr[i]<< std::endl;
    }

/*
Final conclusion made after these random testing:

parr == arr == &arr[0]
parr[i] == arr[i] == *(parr + i)
parr + i == &arr[i] 

&arr has no significance
*/

// Delete operator...

    int* array = new int[3];
    array[0] = 10;
    array[1] = 20;
    array[2] = 30;

    for (int i = 0; i<3; i++){
        std::cout<< "The value at position "<< i<< " of array is "<< array[i]<< std::endl;
    }
    // Now deleting those shits..
    std::cout<< "Making use of delete operator to delete the dynamically allocated array shits..."<< std::endl;
    delete[] array; // --> basically for arrays
    // delete array; --> used for int/float and stuff

    for (int i = 0; i<3; i++){
        std::cout<< "The value at position "<< i<< " of array is "<< array[i]<< std::endl;
    }
    
    return 0;
}