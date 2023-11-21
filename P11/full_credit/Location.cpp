#include <iostream>
#include <vector>
#include "Location.h"
#include <string>

#include <exception>
#include <regex>
#include <algorithm>


    Location::Location(std::string filename, int line) : filename{filename}, line{line} {}

    std::ostream& operator<<(std::ostream& os, const Location& location) {
    os << location.filename << "line" <<location.line;
    return os;
    }

       


    int Location::compare(const Location& rhs) const {
        if(filename < rhs.filename ) return -1;
        if(filename > rhs.filename ) return 1;
        if(line < rhs.line) return -1;
        if(line > rhs.line) return 1;
        return 0;
    }

    