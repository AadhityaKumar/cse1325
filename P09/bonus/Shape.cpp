#include <iostream>
#include <vector>
#include "Shape.h"
#include <string>


Shape::Shape() {}

std::string Shape::name() {
    return "Shape";
}

double Shape::area() {
    return 0.0;
}

std::string Shape::to_string() {
    return name() + " with area " + std::to_string(area());
} 
