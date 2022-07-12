#include<iostream>
#include<fstream>

int main(){
    std::ofstream pout("sample60.txt");
    std::string name;
    std::cout<< "Please, enter your holy name master: ";
    std::cin>> name;

    pout<< "The name of my master is " + name + ".";
    
    pout.close(); // closing the output stream connection with the file.. for later use.

    std::ifstream pin("sample60.txt");
    std::string reading;
    //pin>> reading; // Will read till the first space only.

    getline(pin, reading);
    std::cout<< "The contents of specified file are: '"<< reading<< "'"<< std::endl;

    pin.close(); // CLOSING the input stream connection with the file.. for later use
    
    return 0;
}