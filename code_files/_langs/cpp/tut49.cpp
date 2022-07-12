#include<iostream>
// Initialisation list in cosntructor...
// The syntax for the same is as same as writing a constructor in derived class which is have a base classes with input driven constructors just what you have to do is.. initialise the variables after the colon.. and use variables as functions/objects and input value in brackets..
// This is just another method of initialisation.. lol

class Test{
    int a; // a is declared before b.. thus it must be inaitialised before b *ONLY IN CASE OF CONSTRUCTOR INITIALISATION LIST.
    int b;
    public:
    /*
    Valid syntaxes:
                Test(int i, int j) : a(i), b(j)
                Test(int i, int j) : a(i), b(i + j)
                Test(int i, int j) : a(i), b(2 + j)
                Test(int i, int j) : a(i), b(a + j)
    Invalid syntaxes:
                Test(int i, int j) : b(j), a(i + b) 
        WHY????
        ---> Because in the beginning a is declared first, thus it must be initialisd first.

    */
        Test(int i, int j) : /*This is the initialisation section */ a(i), b(j){
            std::cout<< "Value of a and b are "<< a<<  " and "<< b<< " respectively."<< std::endl;
        }
};

int main(){

    Test t(6, 9);

    return 0;
}