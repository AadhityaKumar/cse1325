#ifndef RECTANGLE_H
#define RECTANGLE_H

#include <iostream>
#include "Shape.h"

class Rectangle : public Shape {
    public:
        Rectangle();
        Rectangle(double width, double height); //: Shape() {}
        std::string name() override;
        double area() override;
    private:
        double width;
        double height;

};

#endif