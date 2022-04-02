#include<iostream>
using namespace std;

// Base Class
class Employee{

public:
    int id;
    float salary;
    Employee(void){
        salary = 69.69;
    } // This was necessary since after the creation of object under Programmer the default constructor of it's
      // base class is executed.. which is the Employee class this time.
    Employee(int inputID){
        id = inputID;
        salary = 69.69;
    }
};

// ***** Default visibility mode is private ******
/*
Private mode: Public members of Base class become private members of derived class
Public mode: Public members of Base class become public members of the derived class.

What happens to the private members of Base Class?
~ Since they are private... they are not inherited !!
*/
// Creating a derived class named Proggrammer from Employee
 class Programmer : public Employee{
     public:
     int languageCode;
        Programmer(int inpID){
            id = inpID;
            languageCode = 6;
        }
 };

int main(){
    Employee arpit, jatin;
    cout<< arpit.salary<< endl;
    cout<< jatin.salary<< endl;

    Programmer skillF(69);
    cout<< skillF.languageCode<< endl;

    return 0; 
}