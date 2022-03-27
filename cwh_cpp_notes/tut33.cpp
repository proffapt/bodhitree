#include<iostream>
using namespace std;

class bankDeposit{
    int principal;
    int years;
    float interestRate;
    float returnValue;

public:

    bankDeposit(void){} // This is to be called when the object is not initialised be it implicitly or explicitly.. otherwise the compiler
                        // will be confused on which constructor to call by default since the object is created.. so it has to call a constructor
                        // and you have not given any kind of data.. so you have to have a void constructor..

    bankDeposit(int p, int y, float r);
    bankDeposit(int p, int y, int r);
    void show(void);
    
};

bankDeposit :: bankDeposit(int p, int y, float r){
    principal = p;
    years = y; 
    interestRate = r;
    returnValue = 0;

    for (int i = 0; i < y; i++){
        returnValue = principal * (1 + r);
    }

}

bankDeposit :: bankDeposit(int p, int y, int r){
    principal = p;
    years = y; 
    interestRate = float(r)/100;
    returnValue = principal;

    for (int i = 0; i < y; i++){
        returnValue = principal * (1 + interestRate);
    }

}

void bankDeposit :: show(void){
    cout<< endl<< "Your principle amount was "<< principal<< "."<< endl
    << "And now your returnvalue afte "<< years
    << " years is "<< returnValue<< endl;
}

int main(){

    bankDeposit bd1, bd2, bd3;

    int p, y, r;
    float R;

    cout<< "Enter the value of  p, y and R"<< endl;
    cin>> p>> y>> R;

    bd1 = bankDeposit(p, y, R);
    bd1.show();

    cout<< "Enter the value of  p, y and r"<< endl;
    cin>> p>> y>> r;

    bd2 = bankDeposit(p, y, r);
    bd2.show();

    return 0;
}