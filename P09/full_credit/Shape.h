#ifndef SHAPE_H
#define SHAPE_H

#include <iostream>
#include <string>

class Shape {
  public:
    Shape();
    virtual std::string name();
    virtual double area();
    std::string to_string();   
};

#endif