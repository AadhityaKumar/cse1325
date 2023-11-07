#include <iostream>
#include <vector>
#include "Shape.h"
#include "Circle.h"


    Circle::Circle(double r) : radius(r) {}

    std::string Circle::name() {
        return "Circle";
    }

    double Circle::area() {
        return 3.14 * radius * radius;
    }

