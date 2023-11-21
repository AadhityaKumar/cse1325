#include <iostream>
#include <vector>
#include "Location.h"
#include <string>
#include "Index.h"
#include <exception>
#include <regex>
#include <algorithm>


    Index::Index() {}

    std::ostream& operator<<(std::ostream& os, const Index& index) {
    for(const auto& y : index.index) {
        os << y.first << ": "; 

    for(const auto& z : y.second) {
        os << z << ", "; }
    os << "\n";
    }
    return os;
    }

       
    void Index::add_word(Word word, std::string filename, int line)
    {
       index[word].emplace(filename, line);
    }



   