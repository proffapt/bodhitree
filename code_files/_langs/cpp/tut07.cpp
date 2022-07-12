#include<iostream>
using namespace std;

int c = 69; 

int main(){

    // ******** Retrieval of values of global variable ***********

    int a, b , c;

    cout<< "Enter the value of a: "<< endl;
    cin>> a;
    cout<< "Enter the value of b: "<< endl;
    cin>> b;
    c = a+b;

    cout<< "The sum is "<< c<< endl;
    cout<< "The global value of c is "<< ::c<< endl;

    // ********** Literals ***********

    cout<< "The size of 34.4 is "<< sizeof(34.4)<< endl;
    cout<< "The size of 34.4f is "<< sizeof(34.4f)<< endl;
    cout<< "The size of 34.4F is "<< sizeof(34.4F)<< endl;
    cout<< "The size of 34.4l is "<< sizeof(34.4l)<< endl;
    cout<< "The size of 34.4L is "<< sizeof(34.4L)<< endl;

    // ******** Reference variables **********
    // That's the way of referencing a variable... it's just another name for that variable

    float that = 455;
    float &them = that; 

    cout<< "The value of 'that' is "<< that<< endl<< "The value of 'them' is "<< them<< endl;

    // ******* TypeCasting *********

    int x = 45;
    cout<< "The value of a is "<< (float)x<< endl;

    return 0;
}