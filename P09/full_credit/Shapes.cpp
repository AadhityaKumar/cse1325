#include <iostream>
#include "Shape.h"
#include "Circle.h"
#include "Rectangle.h"

int main()
{
    Shape * ultra = new Circle(4);
    std::cout << ultra->name() << " " << ultra->area() << std::endl;
    delete ultra;

    Shape * mega = new Rectangle(2,3);
    std::cout << mega->name() << " " << mega->area() << std::endl;
    delete mega;

    return 0;
}