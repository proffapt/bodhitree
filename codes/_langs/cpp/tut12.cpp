 #include<iostream>
 using namespace std;

 int main(){

     // fucking pointers FINALLLLYYYY !!

     int a = 69;
     int* b = &a;
     // int *b = &a; is also a valid syntax of declaration.

    // & is the :Adress of: operator 
    cout<< "Address of a is: "<< b<< endl;
    cout<< "Address of a is: "<< &a<< endl;

    // * is the Dereference operator
    cout<< "Value at the pointer b is: "<< *b<< endl;

    // Pointer to pointer

    int** c = &b;
    cout<< "The address of the variable storing the address of a.. that is pointer to the pointer of a is: "<< c<< endl;
    cout<< "see this shit: "<< *c<< endl;
    cout<< "see this too: "<< **c<< endl;
     return 0;
 }