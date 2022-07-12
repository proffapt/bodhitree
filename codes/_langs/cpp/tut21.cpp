#include<iostream>
using namespace std;

class Employee 
{
    private:
        int a, b, c, p; 
        // int getData(); // Declaration of function in private part and thus can't be called outside of it

    public:
        int d, e;
        // p = 5; --> won't work coz the authority to access private variables is with "public funcions" of this class only. 
        void setData(int x, int y, int z){
            a = x;
            b = y;
            c = z;
        }
        void getData();
};

// Here I will be defining the getData function
void Employee :: getData(){
    cout<< "The value of a is "<< a<< endl;
    cout<< "The value of b is "<< b<< endl;
    cout<< "The value of c is "<< c<< endl;
    cout<< "The value of d is "<< d<< endl;
    cout<< "The value of e is "<< e<< endl;
    cout<< "The value of p is "<< p<< endl;
}

int main(){

    Employee arpit; // Object creation
    // arpit.p = 69; --> Won't work.. not allowed to access..
    arpit.d = 5;
    arpit.e = 8;
    arpit.setData(56, 7, 1);
    arpit.getData();

    return 0;
}