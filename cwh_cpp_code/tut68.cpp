#include<iostream>
// Member Function templates.

template <class T>
class proffapt{
    public:
        T data;
        proffapt(T a){
            data = a;
        }
        // void display(void){
        //     std::cout<< data<< std::endl;
        // }
        void display(void); // calling of the function
};

// This is the syntax to do so.
template <class T>
void proffapt<T> :: display(void){
    std::cout<< data<< std::endl;
}

int main(){

    proffapt<int> p(5);
    p.display();
    proffapt<float> q(3.6);
    q.display();
    proffapt<char> r('c');
    r.display();

    return 0;
}