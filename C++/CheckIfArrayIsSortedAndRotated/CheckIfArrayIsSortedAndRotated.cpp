#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    bool check(vector<int>& nums) {
        unsigned char minPos = 0U;

        for (unsigned char i = 0U; i < nums.size() - 1U; ++i) {
            if (nums.at(i) > nums.at(i + 1U)) {
                minPos = i + 1U;
                break;
            }
        }
        
        for (unsigned char i = minPos; i < nums.size() - 1U + minPos; ++i) {
            if (nums.at(i % nums.size()) > nums.at((i + 1U) % nums.size())) {
                return false;
            }
        }

        return true;
    }
};


int main()
{
    Solution sol;
    std::vector<int> ex1 = {3, 4, 5, 1, 2};
    bool res = sol.check(ex1);
    std::cout << "res should be true: " << (res ? "true\n" : "false\n");
    std::vector<int> ex2 = {2, 1, 3, 4};
    res = sol.check(ex2);
    std::cout << "res should be false: " << (res ? "true\n" : "false\n");
    std::vector<int> ex3 = {1, 2, 3};
    res = sol.check(ex3);
    std::cout << "res should be true: " << (res ? "true\n" : "false\n");
    std::vector<int> ex4 = {2, 1};
    res = sol.check(ex4);
    std::cout << "res should be true: " << (res ? "true\n" : "false\n");
    std::vector<int> ex5 = {6, 10, 6};
    res = sol.check(ex5);
    std::cout << "res should be true: " << (res ? "true\n" : "false\n");
    std::vector<int> ex6 = {10, 1, 1, 10};
    res = sol.check(ex6);
    std::cout << "res should be true: " << (res ? "true\n" : "false\n");
    std::vector<int> ex7 = {1, 2, 1, 1};
    res = sol.check(ex7);
    std::cout << "res should be true: " << (res ? "true\n" : "false\n");
    return 0;
}
