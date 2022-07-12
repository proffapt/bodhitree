#include<iostream>
using namespace std;

// A-->B-->C .. this ABC path is termed as the inheritance path.

class Student{
    protected:
        int roll_number;
    public:
        void set_roll_number(int);
        void get_roll_number(void);
};

void Student :: set_roll_number(int r){ 
    roll_number = r;
}

void Student :: get_roll_number(void){
    cout<< "Your roll number is: "<< roll_number<< endl;
}

class Exam : public Student{
    protected:
        float maths;
        float physics;
    public:
        void set_marks(float, float);
        void get_marks(void);
};

void Exam :: set_marks(float a, float b){
    maths = a;
    physics = b;
}

void Exam :: get_marks(void){
    cout<< "Your marks in maths are "<< maths<< " and in physics are "<< physics<< ". "<< endl;
}

class Result : public Exam{
    float percentage;
public:
    void display(){
        get_roll_number();
        get_marks();
        cout<< "Your result is: "<< (maths + physics)/2<< "%. "<< endl;
    }
};

int main(){

    Result arpit;
    arpit.set_roll_number(6909);
    arpit.set_marks(69, 96);
    arpit.display();

    return 0;
}