#include <iostream>
#include <vector>
#include "Shape.h"
#include "Circle.h"


    Circle::Circle(double radius) : radius{radius} {}

    std::string Circle::name() {
        return "Circle";
    }

    double Circle::area() {
        return M_PI * radius * radius;
    }

