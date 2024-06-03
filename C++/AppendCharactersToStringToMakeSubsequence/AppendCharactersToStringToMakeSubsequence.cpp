#include <iostream>
#include <string>

class Solution
{
public:
    int appendCharacters(std::string s, std::string t)
    {
        int sIndex = 0, tIndex = 0;
        while(sIndex < s.length() && tIndex < t.length())
        {
            if(s[sIndex] == t[tIndex])
            {
                tIndex++;
            }
            sIndex++;
        }
        return t.length() - tIndex;
    }
};

int main()
{
    Solution sol;
    std::string s = "coaching", t = "coding";
    std::cout << sol.appendCharacters(s, t) << " should be 4" << std::endl;
    s = "abcde";
    t = "a";
    std::cout << sol.appendCharacters(s, t) << " should be 0" << std::endl;
    s = "z";
    t = "abcde";
    std::cout << sol.appendCharacters(s, t) << " should be 5" << std::endl;
    return 0;
}