#ifndef __LOCATION_H
#define __LOCATION_H

#include <iostream>
#define _USE_MATH_DEFINES
#include <cmath>

class Location{
    public:
        Location(std::string filename, int line);

        inline bool operator==(const Location& rhs) const {return (compare(rhs) == 0);}
        inline bool operator!=(const Location& rhs) const {return (compare(rhs) != 0);}
        inline bool operator<(const Location& rhs) const {return (compare(rhs) < 0);}
        inline bool operator<=(const Location& rhs) const {return (compare(rhs) <= 0);}
        inline bool operator>(const Location& rhs) const {return (compare(rhs) > 0);}
        inline bool operator>=(const Location& rhs) const {return (compare(rhs) >= 0);}

        friend std::ostream& operator<<(std::ostream &out, const Location &location);
        friend std::istream& operator>>(std::istream &in, Location &location);

         
    private:
        int line;
        std::string filename;

        int compare(const Location& rhs) const;

};

#endif