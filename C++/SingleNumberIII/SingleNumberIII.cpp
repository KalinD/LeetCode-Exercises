#include <vector>
#include <iostream>
#include <map>

class Solution
{
public:
    std::vector<int> singleNumber(std::vector<int> &nums)
    {
        if (nums.size() == 2)
            return nums;
        std::map<int, int> numToCount;
        std::vector<int> res;
        for (int i = 0; i < nums.size(); i++)
        {
            std::map<int, int>::iterator it = numToCount.find(nums[i]);
            if (it != numToCount.end())
            {
                numToCount.at(nums[i])++;
            }
            else
            {
                numToCount.insert({nums[i], 1});
            }
        }

        std::map<int, int>::const_iterator mIter;
        for (mIter = numToCount.begin(); mIter != numToCount.end(); mIter++)
        {
            if (mIter->second == 1)
            {
                res.push_back(mIter->first);
            }
        }

        return res;
    }
};

int main()
{
    Solution sol;
    std::vector<int> ex1 = {1, 2, 1, 3, 2, 5};
    std::vector<int> res = sol.singleNumber(ex1);
    std::cout << "[" << res[0] << ", " << res[1] << "] should be [5, 3]" << std::endl;
    std::vector<int> ex2 = {-1, 0};
    res = sol.singleNumber(ex2);
    std::cout << "[" << res[0] << ", " << res[1] << "] should be [-1, 0]" << std::endl;
    std::vector<int> ex3 = {0, 1};
    res = sol.singleNumber(ex3);
    std::cout << "[" << res[0] << ", " << res[1] << "] should be [0, 1]" << std::endl;
    return 0;
}
