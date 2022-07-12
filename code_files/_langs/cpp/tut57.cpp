#include<iostream>

// Rules for virtual functions
/*
    - They can't be static functions
    - They are accessed by object pointers
    - They can be a friend function of another class.
    - They can be left useless when they are in base class and drived class has someone like them.
    - If the derived class has no instance for that virtual class.. then the instance of that virtual function in base class is executed.
*/

class CWH{
    protected:
        std::string title;
        float rating;
    public:
        CWH(std::string s, float r){
            title =  s;
            rating = r;
        }
        virtual void display(){} // will be skipped to the display function of object calling this particular function
};

class CWHVideo: public CWH
{
    float videoLength;
    public:
        CWHVideo(std::string s, float r, float vl): CWH(s, r){
            videoLength = vl;
        }
        void display(){
            std::cout<<"This is an amazing video with title "<<title<<std::endl;
            std::cout<<"Ratings: "<<rating<<" out of 5 stars"<<std::endl;
            std::cout<<"Length of this video is: "<<videoLength<<" minutes"<<std::endl;
        }
};    

class CWHText: public CWH
{
    int words;
    public:
        CWHText(std::string s, float r, int wc): CWH(s, r){
            words = wc;
        }
     void display(){
      std::cout<<"This is an amazing text tutorial with title "<<title<<std::endl;
      std::cout<<"Ratings of this text tutorial: "<<rating<<" out of 5 stars"<<std::endl;
      std::cout<<"No of words in this text tutorial is: "<<words<<" words"<<std::endl;
         }
};

int main(){
    std::string title;
    float rating, vlen;
    int words;

    // for Code With Harry Video
    title = "Django video tutorial";
    vlen = 4.56;
    rating = 4.89;
    CWHVideo djVideo(title, rating, vlen);

    // for Code With Harry Text
    title = "Django tutorial document";
    words = 433;
    rating = 4.19;
    CWHText djText(title, rating, words);

    CWH* tuts[2]; // method 5 of creating an array of pointers
    tuts[0] = &djVideo;
    tuts[1] = &djText;

    tuts[0]->display();
    tuts[1]->display();

    return 0;
}