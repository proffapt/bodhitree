#include<iostream>
using namespace std;

class Number{

    int a;
public:

    Number(void){
        a = 0;
    }
    // This is where the copy constructor is called..
    // But here is a catch.. this god damn compiler has default copy constructor.. you create a new for.. if you want to add some other functionality
    // to it.. 
    Number(Number &obj){ // when the variable is not pre-declared.. & is used as referencing operator.. which is itself the address of obj.. that is referring to variable mean.. referring to it's address.. and when you store it in a variable.. that's called pointer.
                         // within the function
        cout<< "-----This is where the copy constructor is called.-----"<< endl;
        a = obj.a;
    }

    Number(int num){
        a = num;
    }

    void display(void){
        cout<< "The number for this object is "<< a<<"."<< endl;
    }
};

int main(){

    Number x, y, z(69), z2;
    z.display();
    x.display();
    y.display();

    // To create an object copy of say like... z1 which resembles like z..
    // We use the concept of copy constructor..

    Number z1(z); // Copy constructor is invoked
    z1.display();

    z2 = y; // Copy constructor is not invoked.. instead the default one is invoked. 
    z2.display();

    Number z3 = x; // Copy constructor is invoked
    z3.display();

    return 0;
}