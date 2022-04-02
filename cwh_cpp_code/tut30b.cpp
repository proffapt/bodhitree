#include<iostream>
#include<math.h>
using namespace std;

class Point{
    int x, y;
    public:

    friend float dis(Point, Point);

        Point(int a, int b){
            x = a;
            y = b;
        }

        void getPoint(void){
            cout<< "Coordinates of your point is ("<< x<<", "<<y << ")"<< endl;
        }
};

float dis(Point p1, Point p2){
    return sqrt(pow((p1.x - p2.x), 2) + pow((p1.y - p2.y), 2));
}

int main(){

    Point a(5, 6);
    Point b(1, 9);

    a.getPoint();
    b.getPoint();

    cout<< "The distance between points a and b is: "<< dis(a, b)<< endl;
    
    return 0;
} 