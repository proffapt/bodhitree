#include<iostream>
using namespace std;

int factorial(int n){
    if(n<=1){
        return 1; // that is if n becomes 1 or 0 in the process the output will still be 1.
    }
    else
        return n * factorial(n-1);
}

int fibonacci(int x){
    if (x == 1 || x == 2){
        return 1;
    }
    return fibonacci(x-2) + fibonacci(x-1);
}

int main(){

    // ........ Factorial of a number ..........

    // int a;
    // cout<< "Enter the number, for which you want to calculate it's factorial "<< endl;
    // cin>> a;
    // cout<< "The value of the factorial of "<< a<<" is : "<< factorial(a)<< endl;

    // ******** Fibonacci Series ***********

    int a;
    cout<< "Type the position of term :"<< endl;
    cin>> a;
    cout<< "The "<< a<<"th term in the Fibonacci Series is: "<< fibonacci(a)<< endl;
    return 0;
}