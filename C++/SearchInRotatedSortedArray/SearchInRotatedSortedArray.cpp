#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int search(vector<int>& nums, int target) {
        unsigned long l = 0U;
        const int lastValue = nums.at(nums.size() - 1U);

        if (lastValue < nums.at(0U)) {
            for (unsigned long i = 0U; i < nums.size() - 1U; ++i) {
                if (nums.at(i) > nums.at(i + 1U)) {
                    l = i + 1U;
                    break;
                }
            }
        }
        
        unsigned long r = (0U == l) ? (nums.size() - 1U) : (l - 1U);
        if (target > lastValue) {
            l = 0U;
        } else {
            r = nums.size() - 1U;
        }

        while(l <= r) {
            unsigned long m = (l + r) / 2U;
            if (target == nums.at(m)) { // This is the target
                return m;
            }

            if (r == l) {
                break;
            }

            if (target > nums.at(m)) {
                if (nums.size() - 1U == m) {
                    break;
                }
                l = m + 1U;
            } else if(target < nums.at(m)) {
                if (0U == m) {
                    break;
                }
                r = m - 1U;
            }
        }
        return -1;
    }
};

int main()
{
    Solution sol;
    std::vector<int> ex1 = {4,5,6,7,0,1,2};
    int res = sol.search(ex1, 0);
    std::cout << "res should be 4: " << res << std::endl;
    std::vector<int> ex2 = {4,5,6,7,0,1,2};
    res = sol.search(ex2, 3);
    std::cout << "res should be -1: " << res << std::endl;
    std::vector<int> ex3 = {1};
    res = sol.search(ex3, 0);
    std::cout << "res should be -1: " << res << std::endl;
    std::vector<int> ex4 = {1, 3};
    res = sol.search(ex4, 0);
    std::cout << "res should be -1: " << res << std::endl;
    return 0;
}
