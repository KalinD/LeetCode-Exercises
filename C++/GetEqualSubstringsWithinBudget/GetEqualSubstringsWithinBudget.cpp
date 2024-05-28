#include <iostream>
#include <vector>
#include <algorithm>

class Solution
{
public:
    int equalSubstring(std::string s, std::string t, int maxCost)
    {
        int res = 0;
        unsigned int l = 0, r = 0;
        unsigned int cost = 0;
        while (l < s.length() && r < s.length())
        {
            if (cost <= maxCost)
            {
                cost += (s[r] > t[r] ? (s[r] - t[r]) : (t[r] - s[r]));
                r++;
            }
            else
            {
                cost -= (s[l] > t[l] ? (s[l] - t[l]) : (t[l] - s[l]));
                l++;
            }
            if (r - l > res && cost <= maxCost)
                res = r - l;
        }

        return res;
    }
};

int main()
{
    Solution sol;
    std::string s = "abcd", t = "bcdf";
    int maxCost = 3;
    std::cout << sol.equalSubstring(s, t, maxCost) << " should be 3" << std::endl;

    s = "abcd";
    t = "cdef";
    maxCost = 3;
    std::cout << sol.equalSubstring(s, t, maxCost) << " should be 1" << std::endl;

    s = "abcd";
    t = "acde";
    maxCost = 0;
    std::cout << sol.equalSubstring(s, t, maxCost) << " should be 1" << std::endl;

    s = "abcd";
    t = "cdef";
    maxCost = 1;
    std::cout << sol.equalSubstring(s, t, maxCost) << " should be 0" << std::endl;

    return 0;
}