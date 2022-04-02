#include<iostream>
using namespace std;

class Shop{

private:

    int itemID[100];
    int itemPrice[100];
    int counter;

public:

    void initCounter(void){ counter = 0; }
    void setPrice(void);
    void displayPrice(void);

};

void Shop :: setPrice(void){
    cout<< "Enter the ID of the "<< counter<< " item of interest: "<< endl;
    cin>> itemID[counter];
    cout<< "Enter the Price of that particular item: "<< endl;
    cin>> itemPrice[counter];
    counter ++;
}

void Shop :: displayPrice(void){
    for(int i = 0; i < counter; i++){
        cout<< "The price of item with itemID: "<< itemID[i]<< " is Rs."<< itemPrice[i]<< endl;
    }
}

int main(){

    Shop VMart;
    VMart.initCounter();
    VMart.setPrice();
    VMart.setPrice();
    VMart.setPrice();
    VMart.setPrice();
    VMart.setPrice();
    VMart.setPrice();
    VMart.setPrice();
    VMart.setPrice();
    VMart.setPrice();
    VMart.setPrice();
    VMart.setPrice();
    VMart.displayPrice();
    return 0;
}