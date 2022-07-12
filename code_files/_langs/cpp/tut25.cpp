#include<iostream>
using namespace std;

class Employee{

private:

    int id;
    int salary;

public:

    void setId(void);
    void getId(void);

};

void Employee :: setId(void){
    salary = 122;
    cout<< "Enter the mother fucking employee id: "<< endl;
    cin>> id;
}

void Employee :: getId(void){
    cout<< "The employee id is: "<< id<< endl;
}

int main(){

    // Employee arpit, anamika, janu;

    // arpit.setId();
    // arpit.getId();

    Employee Cybernity[4]; // Use of array with class

    for (int i  = 0; i < 4; i++){
        Cybernity[i].setId();
        Cybernity[i].getId();
    }

    return 0;
}