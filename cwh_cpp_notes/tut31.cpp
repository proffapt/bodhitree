#include<iostream>
using namespace std;

class Complex{
    int a, b;
    public:

        Complex(){
            a = 0;
            b = 0;
        }

        Complex(int x, int y){
            a = x;
            b = y;
        }

        Complex(int x){
            a = x;
            b = 69;
        }

        // ALITER.. using default arguments

        /*
        Complex(int x, int y = 69){
            a = x;
        }
        */

       // ******** IMPORTANT ***********
       // The above method is a hybrid you give one data.. other will be 69.. you give two datas.. it will over-write the 69.

        // That's fucking constructor overloading. 

        void printNum(void){
        cout<< "Your complex Number is "<< a<< " + "<< b<< "i ."<< endl;
        }

        

};

int main(){

    Complex c1(6, 9);
    c1.printNum(); 

    Complex c2(3);
    c2.printNum();

    Complex c3;
    c3.printNum();

    return 0;
}