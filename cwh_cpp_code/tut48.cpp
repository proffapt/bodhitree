#include<iostream>
// Constructors in Derived class:

/*
1. Base class's constructor is called by default when created an object using derived class. (If it has arguments then pass into derived's object it will pass onto the base's constructor)
2. If both base and derived class have a constructor then derived class's constructor is executed first.
3.                           ***** ORDER OF EXECUTION OF CONSTRUCTORS ******
    - Mutlilevel: is same as that of order of inheritance.. in the flow diagram like A --> B --> C.
    - Multiple: class C : public A, public B... order will be A then B.. that is the order of declaration
    - Virtual base class : invoked first as compared to any non-virtual base class. ### Virtual is VIP.
    - Multiple Virtual base class: executed in the order of declaration.
    - Derived class constructor : executed in the very END.
*/

 class Base1{
     int data1;
     public:
        Base1(int i){
            data1 = i;
            std::cout<< "Base1 class constructor is called here! "<< std::endl;
        }
        void printData(){
            std::cout<< "The value of data1 is "<< data1<< std::endl;
        }
 };

class Base2{
         int data2;
     public:
        Base2(int i){
            data2 = i;
            std::cout<< "Base2 class constructor is called here! "<< std::endl;
        }
        void printData(){
            std::cout<< "The value of data2 is "<< data2<< std::endl;
        }
};

class Derived : public Base1, public Base2{
    int derived1, derived2;
    public:
    // This is the syntax to create a constructor in derived class.
        Derived(int a, int b, int c, int d) : Base1(a), Base2(b){
            derived1 = c;
            derived2 = d;
            std::cout<< "Derived class constructor called here!"<< std::endl;
        }
    // Again by giving the same name to the constructor of Derived class as that of both base classes.. will over-write their functions to the one which is in derived class..
        void printData(){
            std::cout<< "The value of derived1 is "<< derived1<< std::endl;
            std::cout<< "The value of derived2 is "<< derived2<< std::endl;
        }
};

int main(){
    Derived proffapt(1, 2, 3, 4);

    // I tried it and it worked!!.. scope resulting the function also works this way.. wow!
    proffapt.Base1::printData(); // I did it
    proffapt.Base2::printData(); // I DID IT
    
    // Function froom the derived class will be called
    proffapt.printData();

    return 0;
}