#include<iostream>
using namespace std;

int sum(int a, int b, int c){
    cout<< "\n[*]Using the three-arg function...."<< endl;
    return a+b+c;
}

int sum(int a, int b){
    cout<< "\n[*]Using the two-arg function....."<< endl;
    return a+b;
}

int main(){

    cout<< "The sum of 5 and 8 is "<< sum(5, 8)<< endl;
    cout<< "The sum of 5,8 and 9 is "<< sum(5,8,9)<< endl;
    return 0;
}