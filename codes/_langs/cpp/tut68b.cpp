#include<iostream>
// when we overload a normal function and templetised function and normal function is the exact match for the given case.. then normal function is prioritised.. that is __EXACT MATCH IS PRIORITISED__

void func(int a){
    std::cout<< "I am integral func() "<< a<< std::endl;
}

void func(char a){
    std::cout<< "I am char func() "<< a<< std::endl;
}

template <class A>
void func(A a){
    std::cout<< "I am templatised func() "<< a<< std::endl;
}

int main(){

    func(65);
    func('c');
    func(666.66);

    return 0;
}