#include<stdio.h>
#include<stdlib.h>

struct myArray{
    int total_size;
    int used_size;
    int *ptr;
};

// What we did here is very similar to creating a class.
void createArray(struct myArray *a, int tSize, int uSize){ // Why pointer? - else it won't be persistent.
                                                           // Since the function is void, it is not returning anything, thus the scope of variable will be within the function and they will die as soon as the function ends.
                                                           // Thus using pointer for persistence, yes the pointers will still die, but the changes will be still effective.
    a->total_size = tSize;
    a->used_size = uSize;
    (*a).ptr = (int *)malloc(tSize*sizeof(int));
}

void setValue(struct myArray *a){
    int m;
    for(int i = 0; i < a->used_size; i++){
        printf("Enter value at index %d : ", i);
        scanf("%d", &m);
        (a->ptr)[i] = m;
   }             
}

void show(struct myArray *a){
    for(int i = 0; i < a->used_size; i++){
        printf("%d\n", (a->ptr)[i]);
   }             
}

int main(){
    // Observe that here we are declaring an "object" not pointer to that "object".
    struct myArray marks; // This is similar to as int marks; int == (struct myArray)
    // The nomenclature for whatever I did here is: I created a DATA TYPE (ADT to be precise):myArray(ABSTRACT DATA TYPE), and then declared a variable 
    // For this data-type as marks(VARIABLE_NAME or say OBJECT)
    // the only difference with class and struct declaration is we had to use struct keyword here.
    createArray(&marks, 20, 10);
    setValue(&marks);
    // Since struct myArray *a = address, then it must take some address as an input.
    show(&marks);

    return 0;
}