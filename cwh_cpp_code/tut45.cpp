#include<iostream>
// Virtual base class

// A --> B and C --> D so what issue will we face.. that is we might inherit the data members of A twice.. lol that's an issue.. when we declare A as a virtual base class.. then this issue is solved!!

class Student{
    protected:
        int roll_no;
    public:
        void set_number(int a){
            roll_no = a;
        }
        void print_number(){
            std::cout<< "Your roll number is: "<< roll_no<< std::endl;
        }
};

// This is the syntax to use the base class as a virtual class, so whenever the first daughters of this class give birth to the same grandchild.. that grand child doesn't inherit same thing multiple times from the grand father class.. this will create ambiguity elsewise..

class Test : virtual public Student{
    protected:
        float maths, physics;
    public:
        void set_marks(float m1, float m2){
            maths = m1;
            physics = m2;
        }
        void print_marks(void){
            std::cout<< "Your result is here:: "<< std::endl
                     << "Maths: "<< maths<< std::endl
                     << "Physics: "<< physics<< ". "<< std::endl;
        }

};

class Sports : virtual public Student{
    protected:
        float score;
    public:
        void set_score(float a){
            score = a;
        }
        void print_score(void){
            std::cout<< "Your PT score is: "<< score<< std::endl;
        }

};

class Results : public Sports, public Test{
    private:
        float total;
    public:
        void display(void){
            total = maths + physics + score;
            print_number();
            print_marks();
            print_score();
            
            std::cout<< "Your total score is: "<< total<< "."<< std::endl;
        }
};

int main(){

    Results proff;

    proff.set_number(100069);
    proff.set_marks(66, 96);
    proff.set_score(69);
    proff.display();

    return 0;
}