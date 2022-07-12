#include<iostream>
using namespace std;

class Base{
    protected: // To declare a private variable which is inheritable.. it is not exactly private..
               // but it works same... except it gets inherited.
        int a;
    private:
        int b; 
};

/*
Some basic rules regarding the derivation and stuff

    - Private members are never inherited.
    - Public derivation never alters the property of members.. protected remains protected and public
    remains public
    - Private and Protected derivation make everything like them.. except the private members.. as they
    are non-inheritable.. that is private makes every member private(be it protected or public member)
     and protected makes every member protected (be it protected or public member)
*/

class Derived : protected Base{

};

int main(){

    return 0;
}
