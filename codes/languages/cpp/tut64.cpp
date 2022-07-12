#include<iostream>
// Templates
/*
- As class is blueprint for objects... templates are blueprint for classes.
- Multiple classes(same ideology but different data types of I/O) can be created with a single template.
- These are also called classes with Parameters( which indeed are data types to be used for the variables defined)
- template when written once.. will be followed to the one class written below it only.. later it will not affect anything.. you have to create a new template if you want to achieve something 
*/

template <class T>
class Product{
    public:
        T pdata1;
        T pdata2;
        Product(T a, T b){
            pdata1 = a;
            pdata2 = b;
            std::cout<< "The product of the spcified numbers = "<< pdata1 * pdata2<< std::endl;
        }
};
// As soon as this semi-colon is entered.. the template syntax ended.. now you can follow normally as you used to do earlier.

template <class U>
class Sum{
    public:
        U sdata1;
        U sdata2;
        Sum(U a, U b){
            sdata1 = a;
            sdata2 = b;
            std::cout<< "The sum of the spcified numbers = "<< sdata1 + sdata2<< std::endl;
        }
};

class Division{
    public:
        float ddata1;
        float ddata2;
        Division(float a, float b){
            ddata1 = a;
            ddata2 = b;
            std::cout<< "The divison of the spcified numbers = "<< ddata1 / ddata2<< std::endl;
        }
};



int main(){

    Product<double> p(3.4, 3.6);
    Sum<int> s1(45, 6);
    Sum<float> s2(4.6, 6);
    Sum<std::string> s3("F", " u");
    Division d(5, 7);

    return 0;
}