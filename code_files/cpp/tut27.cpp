#include<iostream>
using namespace std;

// Forward Declaration

class Complex; // for the sake of cAdd function of Calculator class.

// flow of control will be like the specified sequence thus calculator is added first so that when it is friendzoned in complex class it doesn't 
// throws out some error.

class Calculator{

public:

    int add(int x, int y){
        return x + y;
    }

    // Complex cAdd(Complex o1, Complex o2){
    //     Complex c1;
    //     c1.setNum((o1.a + o2.a), (o1.b + o2.b)); -- here the use of setNum creates issues.
    //     return c1;
    // } 

    // You can't do this right here because only the complex class exist has been given as assurity so whenever complex class is used in here it skips it.
    // trusting that it will find later.. but when you use some members of the complex class for the compiler to proceed it has to know about 
    // all the details of complex class which it will know later so till then we can't use those members.. THEN HOW TO USE?
    Complex cAdd(Complex o1, Complex o2); // Only uses the complex keyword of the class so acceptable
};

class Complex{

private:

    int a, b;

    // individually friend-zoning a particular funciton of a class
    friend Complex Calculator :: cAdd(Complex o1, Complex o2) ;

    // ********* ALITER ***********
    // making class a friend as a whole.
    friend class Calculator;

public:

    void setNum(int n1, int n2){
        a = n1;
        b = n2;
    }

    void printNum(void){
        cout<< "Your complex Number is "<< a<< " + "<< b<< "i "<< endl;
    }

};

// Done after the complex class so that we can use the members inside it.

Complex Calculator :: cAdd(Complex o1, Complex o2){
    Complex c1;
    c1.setNum((o1.a + o2.a), (o1.b + o2.b)); // to use this setNum we had to describe it after the complex class.
    return c1;
}

int main(){

    Complex c1, c2, sum;
    c1.setNum(2, 7);
    c2.setNum(3, 6);

    c1.printNum();
    c2.printNum();

    // sum = Calculator::cAdd(c1, c2); // alternative approach by making cAdd a static function

    Calculator add;
    sum = add.cAdd(c1, c2);
    sum.printNum();

    return 0;
}