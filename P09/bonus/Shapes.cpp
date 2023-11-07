#include <iostream>
#include <vector>
#include "Shape.h"
#include "Circle.h"
#include "Rectangle.h"

int main()
{
    std::vector<Shape*> n;
    
    Shape * ultra = new Circle(4);
    n.push_back(ultra);

    Shape * mega = new Rectangle(2,3);
    n.push_back(mega);

    for(Shape* s : n)
    {
        std::cout << s->to_string() << std::endl;
    }
    
    for(Shape* s : n)
    {
       delete s;
    }
    
    return 0;
}