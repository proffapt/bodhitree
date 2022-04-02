#include<iostream>
using namespace std;

// Ambiguity Resolution in inheritance


// All this is for ambiguity #1
class Base1{
    public:
        void greet(){
            cout<< "How are you?"<< endl;
        }
};

class Base2{
    public:
        void greet(){
            cout<< "kaise hain aap?"<< endl;
        }
};

class Derived : public Base1, public Base2{
    int a;

public:
    void greet(){
        Base2 :: greet();
    }
};

// All this is for ambiguity #2
class B{

public:
    void say(){
        cout<< "Hello world, I am at weird stage of programming!"<< endl;
    }

};

class D : public B{
    int a;
public:
    void say(){
        cout<< "Hello my beautiful people, I am at weird stage of programming!"<< endl; //Base classe's function gets over-written.
    }

};

int main(){

// Ambiguity 1

    // Base1 base1_obj;
    // Base2 base2_obj;

    // base1_obj.greet();
    // base2_obj.greet();

    // Derived D;
    // D.greet();

// Ambiguit 2

    B b;
    D d;

    b.say();
    d.say();

    return 0;
}