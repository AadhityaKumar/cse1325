#ifndef __INDEX_H
#define __INDEX_H

#include <iostream>
#define _USE_MATH_DEFINES
#include <cmath>
#include <map>
#include <set>

typedef std::string Word;
typedef std::set<Location> Locations;


class Index{
    public:

        Index();
        friend std::ostream& operator<<(std::ostream &out, const Index &index);
        void add_word(Word word, std::string filename, int line);

         
    private:
        std::map<Word,Locations> index;
};

#endif

