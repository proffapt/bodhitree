#include<iostream>
#include<fstream>
// File I/O usefull classes are:
/*
    1) fstreambase
    2) ifstream
    3) ofstream

    ifstream and ofstream classes are derived from fstreambase class
*/

// There are two MAIN / COMMON ways to open a file in C++
/*
    1) Using the constructor.
    2) Using the member function open() of the class.
*/

// Terminologies for input and output are from the frame of reference of program.. NOT the file!!

int main(){
    // USING THE CONSTRUCTOR METHOD***

    // Opening + Writing the file
    std::string s = "Arpit Boss";
    std::ofstream out("sample60.txt"); // Allows us to write into the file
    out<< s;

    // Opening + Reading the file
    std::string s2;
    std::ifstream in("sample60b.txt");
    // in>> s2; // gets only the first word in the file.. or can say that till first space. 

    getline(in, s2); // this is a function taking ifstream object and a string variable to store the data it collected
    std::cout<< "The content of file is: "<< s2<< std::endl;

    return 0;
}