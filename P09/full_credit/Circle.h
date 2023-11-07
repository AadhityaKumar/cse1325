#ifndef CIRCLE_H
#define CIRCLE_H

#include <iostream>
#include "Shape.h"

class Circle : public Shape {
    public:
        Circle();
        Circle(double radius); //: Shape() {}
        std::string name() override;
        double area() override;
    private:
        double radius;

};

#endif