#ifndef TIME_H
#define TIME_H

#include <iostream>
#define _USE_MATH_DEFINES
#include <cmath>

class Time{
    public:
        Time(int hour, int minute, int second);
        Time();

        inline bool operator==(const Time& rhs) const {return (compare(rhs) == 0);}
        inline bool operator!=(const Time& rhs) const {return (compare(rhs) != 0);}
        inline bool operator<(const Time& rhs) const {return (compare(rhs) < 0);}
        inline bool operator<=(const Time& rhs) const {return (compare(rhs) <= 0);}
        inline bool operator>(const Time& rhs) const {return (compare(rhs) > 0);}
        inline bool operator>=(const Time& rhs) const {return (compare(rhs) >= 0);}

        friend std::ostream& operator<<(std::ostream &out, const Time &time);
        friend std::istream& operator>>(std::istream &in, Time &time);

        Time& operator++();
        Time operator++(int);
        Time operator+(const Time& other) const;

         
    private:
        int hour;
        int minute;
        int second;

        int compare(const Time& rhs) const;
        void Rationalize();
        std::string to_string() const;  

};

#endif