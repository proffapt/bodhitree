#include<iostream>
// Templates with default parameters

template <class A=int, class B=float, class C=char>
class myClass{
    public:
        A a;
        B b;
        C c;
        myClass(A x, B y, C z){
            a = x;
            b = y;
            c = z;
            std::cout<< "a = "<< a<<std::endl;
            std::cout<< "b = "<< b<<std::endl;
            std::cout<< "c = "<< c<<std::endl;
            std::cout<< "***********"<< std::endl;
        }
};

int main(){

    myClass<> o1(4, 6.9, 'c');
    myClass<int, float, int> o2(6, 7.7, 4);
    myClass<int, int, int> o3(1, 2, 3);

    return 0;
}