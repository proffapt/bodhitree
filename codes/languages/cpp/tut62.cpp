#include<iostream>
#include<fstream>
// Learning about getline() function and pin>> x; thing related to open() and close()
/*
    Each proceeding call continues from the position where the last call ended in.
    open();
    getline(); --> reads line 1
    getline(); --> now reads line 2
    close();
    open();
    getline(); --> reads line 1 again
*/

int main(){
    // Making use of open() and close() member functions..
    
    std::ofstream pout;
    std::ifstream pin;

    pin.open("sample60.txt");
    std::string ireading;
    getline(pin, ireading);
    std::cout<< "Initial content of file is: '"<< ireading<< "'"<< std::endl;
    pin.close();

    pout.open("sample60.txt"); // Just opposite to close(), this opens an output stream connection 
                               // with the specified file.
    // *******************************************
    pout<< "LOL, I HACKED YOUR DEVICE!\nThis is how you enter a data in new line.\n"; // This is how you enter a data in new line
    // *******************************************
    pout.close();

    pin.open("sample60.txt");
    std::string freading1, freading2, freading3;
    // getline(pin, freading); // gets a whole line only
    // ********************************************
    // this is how you get input separated by spaces
    pin>> freading1>> freading2>> freading3; // just like cin.
    std::cout<< "Final 3 words of file are : '"<< freading1<< " "<< freading2<< " "
             << freading3<< "'"<< std::endl;
    // ********************************************

    pin.close(); // see what happens when you don't close the connection.. the next upcoming function will only
                 // start from the 4th word.. since it already read 3 words and the connection was not closed.

    // Reading the whole file data

    pin.open("sample60.txt");

    std::string fullReading;
    std::cout<< "The exact data in the file is: "<< std::endl;
    while(pin.eof() == 0){
        getline(pin, fullReading); // it reads next line whenever it is executed... like first execution results in reading line 1, next excution results in reading line 2.. and so on.. till close() is called
        std::cout<< fullReading<< std::endl;
    }

    pin.close();
    
    return 0;
}