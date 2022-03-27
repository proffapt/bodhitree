#include<iostream>
using namespace std;

class Complex{

private:

    int a, b;

public:

    void setNum(int n1, int n2){
        a = n1;
        b = n2;
    }

// Below line allow the foreign function to access the private members of this class.
// Can be declared.. in public and PRIVATE both parts of the class.

    friend Complex cSum(Complex o1, Complex o2);

    void printNum(void){
        cout<< "Your complex Number is "<< a<< " + "<< b<< "i "<< endl;
    }

};

// Mother fucking asshole.. new understanding of concept of classes.. these are just a custom data types with hell lot of features
// this example below depicts how you create a function outside of a class with no piror declaration.. with type of "Class" not pre-defined data-types
// this below function is not a member of complex class..
// it's just another random function..

Complex cSum(Complex o1, Complex o2){
    Complex a;
    a.setNum((o1.a + o2.a), (o1.b + o2.b));
    return a;
}

int main(){

    Complex c1, c2, sum;
    c1.setNum(2, 4);
    c2.setNum(3, 6);

    c1.printNum();
    c2.printNum();

    // sum.cSum(c1, c2); --> incorrect method to declare the friend function

    sum = cSum(c1, c2); // see how it is used like anyother function
    sum.printNum();

    return 0;
}