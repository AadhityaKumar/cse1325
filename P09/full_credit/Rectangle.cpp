#include <iostream>
#include <vector>
#include "Shape.h"
#include "Rectangle.h"


    Rectangle::Rectangle(double w, double h) : width(w), height(h) {}

    std::string Rectangle::name() {
        return "Rectangle";
    }

    double Rectangle::area() {
        return width * height;
    }

