#include<iostream>
using namespace std;

/*
Destructor neither takes any arguments nor returns any value..
*/

class num{

    public:
         int timer=0;
        num(){
            timer++;
            cout<< "This is where the CONSTRUCTOR for object number "<< timer<< " is called."<< endl;
        }

        ~num(){
            cout<< "This is where the DESTRUCTOR for object number "<< timer<< " is called."<< endl;
            timer--;
        }
};

int main(){
    cout<< "Entering the main block"<< endl;
    num n1;
{
    cout<< "Entering the custom block"<< endl;
    num n2, n3;
    cout<< "Exiting the custom block.."<< endl;
}

    cout<< "Entering the main block again.."<< endl;

    return 0;
}