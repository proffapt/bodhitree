#include<iostream>
using namespace std;

class Employee{
   
private:
    
    int id;
    static int count; // By default a static variable is initialised with zero.
// if we did not use static keyword.. we might end up getting 1 for all the three objects because all the three objects will have a separate count for them.. 
// that is object.count .
// now it's a property of class not of object.
 public:

    void setData(void){
        cout<< "Enter the ID: "<< endl;
        cin>> id;
        count ++;
    }
    
    void getGetData(void){
        cout<< "The ID specified to this employee is "<< id<< ". And till now we have inlisted "<< count<< " employees."<< endl;
    }

// static functions has access to other static functions or variables only..

    static void getCount(void){
      //  cout<< id; --> Throws out error.
        cout<< "The value of count is "<< count<< endl;
    }

};

int Employee :: count = 1000; // for initialisation other than 0 we set values in here.. outside of the class.. even if we don't want to we have to.. we are forced 
// to declare it here anyways. 

int main(){

    Employee arpit, jatin, chirag;

    arpit.setData();
    arpit.getGetData();
    Employee::getCount(); // This type of declaration is possible only with static functions.. which utilises the scope resolution operator.

    jatin.setData();
    jatin.getGetData();
    Employee::getCount();

    chirag.setData();
    chirag.getGetData();
    Employee::getCount();

    return 0;
}