#include<iostream>
// Arrow Operator

class Complex{
    int real, imaginary;
    public:
        void getData(){
            std::cout<< "The value of real part is = "<< real<< std::endl;
            std::cout<< "The value of imaginary part is = "<< imaginary<< std::endl;
        }
        void setData(int a, int b){
            real = a;
            imaginary = b;
        }
};

int main(){
    // Complex c1;
    // Complex* ptr = &c1;
    Complex* ptr = new Complex;

    (*ptr).setData(6, 9);
    // This is the arrow operator.. 
    ptr->getData(); // == (*ptr).getData();
    // Verbally we can say that it is like "ptr" pointer jis object ko point krra hai uska setData run karo
    
    // Array of objects

    Complex a1[3];
    Complex* aptr = a1;
    // Complex* aptr = new Complex[3];

    a1[0].setData(8, 4);
    (*(aptr + 1)).setData(6, 0);
    aptr[2].setData(1, 3);

    for (int i = 0; i < 3; i++)
    {
        (aptr+i)->getData();
    }
    
    
    return 0;
}