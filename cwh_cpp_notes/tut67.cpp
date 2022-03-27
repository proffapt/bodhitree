#include<iostream>
// template functions

template <class A, class B>
float avg(A a, B b){
    float av = (a+b)/2.0;
    return av;
}

int main(){

    float x, y;
    // no need to specify what kind of data type you going to use.. it will be automatically detected!
    x = avg(4, 6);
    y = avg(5.8, 6.5);

    std::cout<< x<< std::endl<< y<< std::endl;

    return 0;
}