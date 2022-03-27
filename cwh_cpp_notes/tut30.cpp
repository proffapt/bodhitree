#include<iostream>
using namespace std;

class Complex{
    int a, b;

    public:

    Complex(int, int); // Parameterised Constructor.

    void printNum(void){
        cout<< "Your complex Number is "<< a<< " + "<< b<< "i ."<< endl;
    }

};

Complex :: Complex(int x, int y){ 
    a = x;
    b = y;
    // cout<< "Hello, World! "<< endl;
}

int main(){

    // implicit call
    Complex a(4, 6);
    a.printNum();

    // Explicit call 
    Complex b = Complex(6, 9);
    b.printNum();
 
    return 0;
}