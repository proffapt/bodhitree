#include<iostream>
using namespace std;

void g(void); // this is fucntion prototyping

int sum(int a, int b){
    // a and b will unformal parameters

    int c = a + b;
    return c;
}

int main(){
    
    int num1, num2;

    g();

    cout<< "Enter the first number "<< endl;
    cin>>num1;
    cout<< "Enter the second number "<< endl;
    cin>>num2;

    // num1 and num2 are formal parameters
    cout<< "The sum of the given numbers is "<< sum(num1, num2)<< endl;
    return 0;
}

void g(){
    cout<< "Welcome, to the programm master!!"<< endl;
    cout<< " "<< endl;
}