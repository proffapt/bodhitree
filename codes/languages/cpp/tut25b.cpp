#include<iostream>
using namespace std;

class complexNumber{

private:

    int a;
    int b;

public:

    void setData(int x, int y){
        a = x;
        b = y;
    }

    void printNumber(void){
        cout<< "The required complex number is "<< a<<" + "<< b<<"i "<< endl;
    }

    void cSum(complexNumber o1, complexNumber o2){
        a = o1.a + o2.a;
        b = o1.b + o2.b;
    }

};

int main(){

    complexNumber c1, c2, c3;

    c1.setData(4, 6);
    c1.printNumber();

    c2.setData(7, 9);
    c2.printNumber();

    c3.cSum(c1, c2);
    c3.printNumber();

    return 0;
}