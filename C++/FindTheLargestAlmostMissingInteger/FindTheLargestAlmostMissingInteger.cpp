#include <vector>
#include <iostream>
#include <unordered_map>
#include <unordered_set>

using namespace std;

class Solution {
public:
    int largestInteger(vector<int>& nums, int k) {
        unordered_map<int, int> num_to_count;

        int left = 0;
        int right = k;

        while (right <= nums.size()) {
            unordered_set<int> current_group;
            for(int i = left; i < right; ++i) {
                if (current_group.end() == current_group.find(nums.at(i))) {
                    current_group.insert(nums.at(i));
                    if (num_to_count.end() != num_to_count.find(nums.at(i))) {
                        ++num_to_count[nums.at(i)];
                    } else {
                        num_to_count[nums.at(i)] = 1;
                    }
                }
            }
            ++left;
            ++right;
        }

        if (1 == num_to_count.size() && k == 1) {
            return -1;
        }

        int max_number = -1;
        for(auto pair : num_to_count) {
            if ((pair.second == 1) && (max_number < pair.first)) {
                max_number = pair.first;
            }
        }

        return max_number;
    }
};

int main() {
    Solution sol;

    vector<int> ex1 = {3, 9, 2, 1, 7};
    cout << "Example 1 should be 7: " << sol.largestInteger(ex1, 3) << endl;

    vector<int> ex2 = {3, 9, 7, 2, 1, 7};
    cout << "Example 2 should be 3: " << sol.largestInteger(ex2, 4) << endl;

    vector<int> ex3 = {0, 0};
    cout << "Example 3 should be -1: " << sol.largestInteger(ex3, 1) << endl;

    vector<int> ex4 = {0, 50};
    cout << "Example 4 should be 50: " << sol.largestInteger(ex4, 1) << endl;

    vector<int> ex5 = {8, 1, 8};
    cout << "Example 5 should be 8: " << sol.largestInteger(ex5, 3) << endl;

    vector<int> ex6 = {4,4,2,2,2,0,5,3,4,4};
    cout << "Example 6 should be -1: " << sol.largestInteger(ex6, 3) << endl;

    vector<int> ex7 = {8,6,2,8,6};
    cout << "Example 7 should be -1: " << sol.largestInteger(ex7, 4) << endl;

    return 0;
}
