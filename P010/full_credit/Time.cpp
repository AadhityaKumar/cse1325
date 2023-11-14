#include <iostream>
#include <vector>
#include "Time.h"
#include <string>

#include <exception>
#include <regex>
#include <algorithm>


    Time::Time(int hour, int minute, int second) : hour{hour}, minute{minute}, second{second} {Rationalize();}

    Time::Time() : hour{0}, minute{0}, second{0} {}

    std::ostream& operator<<(std::ostream& os, const Time& time) {
    os << time.to_string();
    return os;
    }

    std::istream& operator>>(std::istream& is, Time& time) {
    char colon;

    is >> time.hour >> colon >> time.minute >> colon >> time.second;
    time.Rationalize();
    return is;
}



    void Time::Rationalize() {
        while(second > 59)
        {
            second = second - 60;
            minute++;
        }

        while(second < 0)
        {
            second = (second + 60);
            minute--;
        }

        while(minute > 59)
        {
            minute = minute - 60;
            hour++;
        }

        while(minute < 0)
        {
            minute = (minute + 60);
            hour--;
        }

        if(hour > 23 || hour < 0)
        {
            hour = 0;
            minute = 0;
            second = 0;
        }
    }

       Time& Time::operator++()
        {
            second++;
            Rationalize();
            
            return *this;
        }

        Time Time::operator++(int)
        {
            Time temp = *this;
            ++(*this);
            return temp;
        }

        Time Time::operator+(const Time& other) const
        {
            return Time(hour + other.hour, minute + other.minute, second + other.second);
        }

       


    int Time::compare(const Time& rhs) const {
        if(hour < rhs.hour ) return -1;
        if(hour > rhs.hour ) return 1;
        if(minute < rhs.minute) return -1;
        if(minute > rhs.minute) return 1;
        if(second < rhs.second ) return -1;
        if(second > rhs.second ) return 1;
        return 0;
    }

    std::string Time::to_string() const {

    std::string hr;
    std::string min;
    std::string sec;

    if(hour < 10)
    {
        hr = "0";
        hr += std::to_string(hour);
    }
    else
    {
        hr = std::to_string(hour);
    }

    if(minute < 10)
    {
        min = "0";
        min += std::to_string(minute);
    }
    else
    {
        min = std::to_string(minute);
    }

    if(second < 10)
    {
        sec = "0";
        sec += std::to_string(second);
    }
    else
    {
        sec = std::to_string(second);
    }


    return hr + ":" + min + ":" + sec;
    } 