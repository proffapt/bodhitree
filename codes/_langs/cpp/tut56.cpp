#include<iostream>
// Virtual Function
/*
If we want a baseClassPOINTER to point to a derivedClassOBJECT but still execute a member function of derivedClass, what we do is we create a function with same name.. and stuff(can be empty also) in the base class as that of in derived class.. and declare that function in base class as virtual function.. which will be skipped of to the one in derived class.
*/

class BaseClass{
    public:
    int varBase;
        void setData(int i){
            varBase = i;
        }
        virtual void getData(){
            std::cout<< "The Base class variable is: "<< varBase<< std::endl; //useless
        }
};

class DerivedClass : public BaseClass{
    public:
    int varDerived;
        // non-used function.
        void setData(int i){
            varDerived = i;
        }
        // only this will run since the other in base class is virtual function which will channel it's call to this function.
        void getData(){
            std::cout<< "The Base class variable is: "<< varBase<< std::endl;
            std::cout<< "The Derived class variable is: "<< varDerived<< std::endl;
        }
};

int main(){

    DerivedClass derivedObject;
    BaseClass* basePointer = &derivedObject;
    basePointer->setData(55); //since it is base class pointer.. it will execute the base class member function
                              // which in turn changes the value of varBase

    // basePointer->varDerived = 99; // only base class data members can be accessed
    derivedObject.varDerived = 66;
    basePointer->getData();

    return 0;
}