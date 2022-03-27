#include<iostream>
using namespace std;

// Constructors
class Complex{
    int a, b;

    public: // Constructors are alaways created under public domain/range.

    /*
    Constructors are special member functions... with name same as of the class... 
    It is used to initialise the objects of that particular class.
    It is automatically invoked as soon as the object is created.
    It has no return type.. they just can't return values..

******* WE CAN NOT REFER TO THE ADDRESS OF CONSTRUCTORS *********

    */
    Complex(void); // this is a declaration of function aka CONSTRUCTOR

    void printNum(void){
        cout<< "Your complex Number is "<< a<< " + "<< b<< "i "<< endl;
    }

};

Complex :: Complex(void){ // ---> This is a default constructor as it run by default.. without you invoking it separately.
    a = 69;
    b = 69;
    cout<< "Hello, World! "<< endl;
}
// Just using another method to declare and write a function separately.. you can do the same where you declared the function for the first time.

int main(){

    Complex c;
    c.printNum();

    return 0;
}