#include<iostream>
#include<string>

using namespace std;

class binary{

    private:

        string s;
        void chk_bin(void);

    public:

        void read(void);
        // void chk_bin(void);
        void ones_c(void);

};

void binary :: read(void){
    cout<< "Enter the binary value : "<< endl;
    cin>> s;
}

void binary :: chk_bin(void){
    for (int i = 0; i < s.length(); i++){
        if (s.at(i) != '1' && s.at(i) != '0'){
            cout<< "Invalid binary format!"<< endl;
            exit(0);
        }
    }
}

void binary :: ones_c(void){
    chk_bin(); // ***CHALAKI DEKHO GUYS**** 
    
    /*
    Any private member of a class can't be called by everyone.. be it a function or a variable..
    To call those you have to use only and only "PUBLIC FUNCTIONS"..
    You can use a Public function to call out a private function or modify a private variable.
    */
    cout<< "The ones compliment of this binary number is: ";
    for(int i = 0; i < s.length(); i++){
        if(s.at(i) == '1'){
            cout<< 0;
        }
        else
            cout<< 1;
    }
    cout<< endl;
}

int main (){

    // Nesting of member functions

    binary bin;
    bin.read();
    // bin.chk_bin(); --> can't be called from here since is a private member of the binary class.
    bin.ones_c();

    return 0;
}