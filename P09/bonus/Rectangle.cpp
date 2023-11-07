#include <iostream>
#include <vector>
#include "Shape.h"
#include "Rectangle.h"


    Rectangle::Rectangle(double width, double height) : width{width}, height{height} {}

    std::string Rectangle::name() {
        return "Rectangle";
    }

    double Rectangle::area() {
        return width * height;
    }

