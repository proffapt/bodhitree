#include<iostream>
using namespace std;

int sum(int a, int b){
    int c = a + b;
    return c;
}

// void swap(int a, int b){
//     int temp = a;
//     a = b;
//     b =  temp;
// }

// The above one didn't really work.. fuck shit

// call by reference using pointer.

void swapPointer(int* x, int* y){
    int temp = *x;
    *x = *y;
    *y = temp;
}

// call by reference using Cpp reference variables.

void swapReferenceVar(int &x, int &y){
    int temp = x;
    x = y;
    y = temp;
}

int main(){

    // call by value and call by reference
    int a = 4, b = 5;

    // cout<< "The value of a + b is "<< sum (a, b)<< endl;
    cout<< "The value of a is "<< a<< endl;
    cout<< "The value of b is "<< b<< endl;
    // swap(a, b); // This wasn't working in reality

    // swapPointer(&a, &b); // this shit really worked

    swapReferenceVar(a, b);

    cout<< " "<< endl;
    cout<< "After swapping...."<< endl;
    cout<< " "<< endl;

    cout<< "The value of a is "<< a<< endl;
    cout<< "The value of b is "<< b<< endl;
    // This was just a testing method to check whether or what is really happening in the background.
    // cout<< "The value of x is "<< x<< " And the value of y is "<< y<<endl;

    return 0;
}