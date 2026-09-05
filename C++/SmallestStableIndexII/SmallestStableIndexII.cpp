#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
        vector<int> mins(nums.size());
        vector<int> maxes(nums.size());

        int current_max = nums.at(0);
        maxes.at(0) = current_max;
        for (int i = 1; i < nums.size(); ++i) {
            if (nums.at(i) > current_max) {
                current_max = nums.at(i);
            }
            maxes.at(i) = current_max;
        }

        int min_index = nums.size() - 1;
        int current_min = nums.at(min_index);
        mins.at(min_index) = current_min;
        for (; min_index >= 0; --min_index) {
            if (nums.at(min_index) < current_min) {
                current_min = nums.at(min_index);
            }
            mins.at(min_index) = current_min;
        }

        for (int i = 0; i < nums.size(); ++i) {
            if ((maxes.at(i) - mins.at(i)) <= k) {
                return i;
            }
        }
        return -1;
    }
};

int main() {
    Solution sol;
    vector<int> ex1 = {5,0,1,4};
    cout << "Example 1 should be 3: " << sol.firstStableIndex(ex1, 3) << endl;
    vector<int> ex2 = {3,2,1};
    cout << "Example 2 should be -1: " << sol.firstStableIndex(ex2, 1) << endl;
    vector<int> ex3 = {0};
    cout << "Example 3 should be 0: " << sol.firstStableIndex(ex3, 0) << endl;
    vector<int> ex4 = {4,3,10,10};
    cout << "Example 4 should be 2: " << sol.firstStableIndex(ex4, 0) << endl;
}