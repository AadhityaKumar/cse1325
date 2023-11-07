#ifndef CIRCLE_H
#define CIRCLE_H

#include <iostream>
#include "Shape.h"
#define _USE_MATH_DEFINES
#include <cmath>

class Circle : public Shape {
    public:
        Circle();
        Circle(double radius);
        std::string name() override;
        double area() override;
    private:
        double radius;

};

#endif