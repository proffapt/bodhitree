#include<iostream>
using namespace std;

int main(){

    // fucking arrays...

    int marks[4] = {23, 45, 69, 89};

    cout<< "This output is using basics of array"<< endl;

    for  (int i=0; i<=3; i++){
        cout<< marks[i]<< endl;
    }

    // I already know most of the stuff.. creation and modifications

    // Talking about pointers and arrays combiningly now:


    cout<< "This output is using pointers concept"<< endl;
     int* p = marks;
     int i=0;
     while (i<=3){
         cout<< *(p+i)<< endl;
         i++;
     }

    return 0;
}