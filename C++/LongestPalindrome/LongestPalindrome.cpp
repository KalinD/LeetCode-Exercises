#include <string>
#include <iostream>
#include <map>

class Solution {
public:
    int longestPalindrome(std::string s) {
        std::map<char, unsigned int> letterToCount;
        for(int i = 0; i < s.length(); i++)
        {
            std::map<char, unsigned int>::iterator it = letterToCount.find(s[i]);
            if (it != letterToCount.end())
            {
                letterToCount.at(s[i])++;
            }
            else
            {
                letterToCount.insert({s[i], 1});
            }
        }
        std::map<char, unsigned int>::iterator it;
        bool usedOdd = false;
        int res = 0;
        for(it = letterToCount.begin(); it != letterToCount.end(); it++)
        {
            if(it->second % 2 == 0)
            {
                res += it->second;
            } else
            {
                if(!usedOdd)
                {
                    res += it->second;
                    usedOdd = true;
                } else 
                {
                    res += it->second - 1;
                }
            }
        }
        return res;
    }
};

int main()
{
    Solution sol;
    std::cout << sol.longestPalindrome("abccccdd") << " should be 7" << std::endl;
    std::cout << sol.longestPalindrome("a") << " should be 1" << std::endl;
    return 0;
}