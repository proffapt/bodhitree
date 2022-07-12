#include<iostream>
// "this" pointer!

/* 'this' is a pointer which points to the object invoking the member function..
    ---> thus it is only useful inside the member functions of a class.. and friend functions are not member funnctions

    that is when you do this->a, it means (*this).a, which is created_object.a
    this->a == (*this).a == created_obj.a

    "Every object in C++ has access to its own address through an important pointer called this pointer. The this pointer is an implicit parameter to all member functions. Therefore, inside a member function, this may be used to refer to the invoking object.
    
    This is not applied to friend function category!"

*/

class A{
    int a;
    int b;
    public:
        void setData(int a); // intentionally setting the name of both variables same.
                             // and this failed successfully.. why??
                             // Because local variables are prioritised more than Global variables.
        void getData(void);

        //#####################################################################################################
        // new syntax of returning an object
/*-->*/ A &setB(int b){ // Focus here
            this->b = b;  // sets the value of b for that object which invoked it
            return *this; // returns the object which invoked this function
        }
};

void A :: setData(int a /*could have used int x */){
    // a = a; --> will result in errors.
    // a = x; --> this i have done multiple times
    this->a /* this refers to the private data member */ = a /* this refers to the entered variable */;
}

void A :: getData(void){
    std::cout<< "The value of a is "<< a<< std::endl;
    std::cout<< "The value of b is "<< b<< std::endl;

}

int main(){
    A a;
    a.setData(69);

    // calling multible member function in a single line
    a.setB(45).getData();
    
    return 0;
}