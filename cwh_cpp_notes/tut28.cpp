#include<iostream>
using namespace std;

class Y;

class X{
    
private:
    int data;

public:
    void setValue(int value){
        data = value;
    }
    friend void add(X o1, Y o2);
};

class Y{
    
private:
    int num;

public:
    void setValue(int value){
        num = value;
    }
    friend void add(X o1, Y o2);
};

void add(X o1, Y o2){
    cout<< "On summing the data values of X and Y we get "<< o1.data + o2.num<< endl;
}

int main(){

    X a;
    Y b;
    a.setValue(6);
    b.setValue(9);

    add(a, b);
    return 0;
}