#include<iostream>
// Pointers to Derived Classes

class BaseClass{
    int varBase;
    public:
        void setData(int i){
            varBase = i;
        }
        void getData(){
            std::cout<< "The Base class variable is: "<< varBase<< std::endl;
        }
};

class DerivedClass : public BaseClass{
    int varDerived;
    public:
        void setData(int i){
            varDerived = i;
        }
        void getData(){
            std::cout<< "The Derived class variable is: "<< varDerived<< std::endl;
        }
};

int main(){

    // Pointer(Base) --> Object(Base)
    BaseClass baseObject1;
    BaseClass* basePointer1 = &baseObject1;
    basePointer1->setData(1);
    basePointer1->getData();
    // Straight Forward

    // Pointer(Derived) --> Object(Derived)
    DerivedClass derivedObject2;
    DerivedClass* derivedPointer2 = &derivedObject2;
    derivedPointer2->setData(2);
    derivedPointer2->getData();
    // Straight Forward

    // Pointer(Base) --> Object(Derived)
    // This is example of late binding..
    DerivedClass derivedObject3;
    BaseClass* basePointer3 = &derivedObject3; // even tho pointing to derivedObject.. this pointer can only access 
                                               // stuff inside base class
    basePointer3->setData(3);
    basePointer3->getData();
    // Pointer is supreme.. it is from base class.. so the base class member functions will be called only!

    // Pointer(Derived) --> Object(Base)
    // BaseClass baseObject4;
    // DerivedClass* derivedPointer4 = &baseObject4;
    // derivedPointer4->setData(4);
    // derivedPointer4->getData();

    // Pointer is supreme.. thus only base class pointer can act as inter-class/object relation.
    // The fourth try is invalid.. lol

    return 0;
}