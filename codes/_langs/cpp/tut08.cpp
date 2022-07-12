#include<iostream>
#include<iomanip> 
using namespace std;

int main(){

    // *********** Constants in cpp **************

    // const int a = 5;
    // cout<< "The initial value of a was: "<< a<< endl;
    // a = 56;
    // cout<< "The new value of a is: "<< a<< endl;

     // ************* Manipulators **********

    int a = 4, b = 56, c = 696, d = 6969;
    cout<< "The value of a with setw is "<< setw(4)<< a<< endl;
    cout<< "The value of b with setw is "<< setw(4)<< b<< endl;
    cout<< "The value of c with setw is "<< setw(4)<< c<< endl;
    cout<< "The value of d with setw is "<< setw(4)<< d<< endl;

    // ******** Operator Precedence **********

    // Use the cpp refereence website .. now i know the real meaning of procedence and associativity 

    return 0;
}