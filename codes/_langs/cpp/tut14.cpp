#include<iostream>
using namespace std;

typedef struct employee
{
    int Eid;
    char favChar;
    float salary; 
} ep;

// union money
// {
//     int rice;
//     char car;
//     float pounds; 
// };

int main(){

union money
{
    int rice;
    char car;
    float pounds; 
};
    // Declaration of enum data type

    enum Material
    {   
        water, 
        gold, 
        silver, 
        aluminium, 
        bronze
    };

    Material mat1 = bronze ;
    cout<< mat1<< endl;
    cout<< bronze<< endl;

    // Declaration of union data type

    union money m1;
    m1.rice = 69;
    cout<< "The amount of rice i have is "<< m1.rice<< endl;
    cout<< " "<< endl;

    // Declaration of struct data type
    
    ep arpit;
    arpit.Eid = 77474;
    arpit.favChar = 'c';
    arpit.salary = 120000000000;

    cout<< "The value is "<< arpit.Eid<< endl;
    cout<< "The value is "<< arpit.favChar<< endl;
    cout<< "The value is "<< arpit.salary<< endl;

    return 0;
}