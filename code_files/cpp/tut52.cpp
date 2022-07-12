#include<iostream>
using namespace std;
// Array of objects combined with pointers

class ShopItem
{
    int id;
    float price;
    public:
        void setData(int a, float b){
            id = a;
            price = b;
        }
        void getData(void){
            cout<<"Code of this item is "<< id<<endl;
            cout<<"Price of this item is "<<price<<endl;
        }
};

int main(){
    int size = 3;
    ShopItem *ptr = new ShopItem [size];
    ShopItem *ptrTemp = ptr; // this was needed for how harry did.. but i have better approach.

    int p, i;
    float q;

    // for (i = 0; i < size; i++)
    // {
    //     cout<<"Enter Id and price of item "<< i+1<<endl;
    //     cin>>p>>q;
    //     // (*ptr).setData(p, q);
    //     ptr->setData(p, q);
    //     ptr++; 
    // }

    // for (i = 0; i < size; i++)
    // {
    //     cout<<"Item number: "<<i+1<<endl;
    //     ptrTemp->getData();
    //     ptrTemp++;
    // }

    // Better implementation from my side.. do this way..
    
    for (i = 0; i < 3; i++)
    {
        cout<<"Enter Id and price of item "<< i+1<<endl;
        cin>> p>> q; // by default next line for imput.. bcoz enter is needed to provide the input.
        (ptr+i)->setData(p, q);
    }

    for (i = 0; i < 3; i++)
    {
        cout<<"Item number: "<< i+1<<endl;
        (ptr+i)->getData();
    }
    
    
    return 0;
}