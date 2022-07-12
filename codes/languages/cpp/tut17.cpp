#include <iostream>
using namespace std;

// inline is used only for very simple 1 or 2 line functions
// what it does is.. it replaces the function call with the actual function thus saving the time 
// spend in copying the variables .. executing the function.. and retrieval of the value of
// output of the function.

inline int product(int x, int y){
    // do not use static variables with inline functions or vice versa..
    static int z = 0; // this executes one time and retains it's values even after the execution of function also..
    z = z + 1;
    return x*y+z;
}

float moneyReceived(int currentMoney, float factor=1.04){ // This was an example of default value of the argument
    return currentMoney * factor;
}

int main(){

    // int a, b;
    // cout<< "Enter the values of a and b "<< endl;
    // cin>> a>> b;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;
    // cout<< "The product of a and b is "<< product(a, b)<< endl;

    int money = 1000;
    cout<< "If you have Rs."<< money<< " in your bank account, you will receive Rs."<< moneyReceived(money)<< " after 1 year."<< endl;
    cout<<  "For VIP: If you have Rs."<< money<< " in your bank account, you will receive Rs."<< moneyReceived(money, 1.1)<< " after 1 year."<< endl;
    return 0;
}