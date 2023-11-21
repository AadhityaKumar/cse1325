#include "Location.h"
#include "Index.h"
#include <iostream>
#include <sstream>
#include <vector>
#include <fstream>
#include <regex>


int main(int argc, char* argv[]) {

Index omega;

for(int j = 1; j < argc; j++) {

std::ifstream ist{std::string{argv[j]}};
if (!ist)  {continue;} //throw std::runtime_error{"can't open input file"};

std::string s;

int line = 0;

while (std::getline(ist, s)){
    
    line++;

    for(int k = 0; k < s.length(); k++)
    {
        s[k] = tolower(s[k]);
    }

    std::regex words_regex("\\b\\w+\\b");
    auto words_begin = std::sregex_iterator(s.begin(), s.end(), words_regex);
    auto words_end = std::sregex_iterator();

    for(std::sregex_iterator i = words_begin; i != words_end; ++i)
    {
        std::smatch match = *i;
        std::string word = match.str();
        std::string fl = argv[j];

        omega.add_word(word,fl,line);

    }


    }

}
    

    std::cout << omega;
    return 0;

}


