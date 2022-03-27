#include<iostream>
// templates with multiple parameters

template <class A, class B>
class myClass{
    
    public:
        A a;
        B b;
        myClass(A a, B b){
            this->a = a;
            this->b = b;

            std::cout<< "a = "<< a<<std::endl;
            std::cout<< "b = "<< b<<std::endl;
            std::cout<< std::endl;
        }
};

int main(){

    myClass<char, int> m1('c', 4);
    myClass<int, float> m2(3, 6.9);

    return 0;
}