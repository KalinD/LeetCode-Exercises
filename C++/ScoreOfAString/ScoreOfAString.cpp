#include <iostream>
#include <string>

class Solution {
public:
    int scoreOfString(std::string s) {
        int res = 0;
        for(int i = 0; i < s.length() - 1; i++)
        {
            res += s[i] > s[i + 1] ? (s[i] - s[i + 1]) : (s[i + 1] - s[i]);
        }
        return res;
    }
};

int main()
{
    Solution sol;
    std::cout << sol.scoreOfString("hello") << " should be 13" << std::endl;
    std::cout << sol.scoreOfString("zaz") << " should be 50" << std::endl;

    return 0;
}