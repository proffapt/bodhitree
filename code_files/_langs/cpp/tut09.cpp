#include<iostream>
using namespace std;

int main(){

    // if-else and switch-case statement.. basically the selection type structure respectively!

    // Anyways i am already comfy with the if-else statement.. lmao

    // Let's play with switch-case statement

    int age;
    cout<< "Tell me your fucking age you bastard: ";
    cin>> age;

    switch (age)
    {
    case 1:
        cout<< "You just are watching the world no fucking need to come and watch the harsh reality of it"<< endl;
        break;
    
    case 18:
        cout<< "Ayo young boy come lemme show you the harsh reality of this world join the fuckin' party!"<< endl;
        break;

    case 32:
        cout<< "Come on mate let's fucking cry over our lives."<< endl;
        break;

    default: 
        cout<< "Bitch are you even born yet??"<< endl;
        break;
    }

    return 0;
}