#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

static void print_vector(std::vector<int> &v)
{
    if (0 == v.size()) {
        cout << "[]\n";
        return;
    }
    cout << "[";
    for (int i = 0; i < v.size() - 1; i++)
    {
        cout << v[i] << ", ";
    }
    cout << v[v.size() - 1] << "]" << endl;
}

class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        vector<int> temp(100);
        vector<int> res;
        int max = 0;
        for(int i = 0; i < nums.size(); ++i) {
            if (nums.at(i) > max) {
                max = nums.at(i);
            }
            temp.at(nums.at(i) - 1) = 1;
        }

        int j = 0;

        while(0 == temp.at(j)) {
            ++j;
        }
        for(; j < max; ++j) {
            if (0 == temp.at(j)) {
                res.push_back(j + 1);
            }
        }

        return res;
    }

    vector<int> findMissingElementsOld(vector<int>& nums) {
        sort(nums.begin(), nums.end());

        vector<int> res;
        for(int i = 0; i < nums.size() - 1; ++i) {
            if (nums.at(i) + 1 != nums.at(i + 1)) {
                for(int j = nums.at(i) + 1; j < nums.at(i + 1); ++j) {
                    res.push_back(j);
                }
            }
        }

        return res;
    }
};

int main() {
    Solution sol;

    vector<int> nums1 = {1, 4, 2, 5};
    vector<int> res1 = sol.findMissingElements(nums1);
    cout << "Example 1 should be [3]: ";
    print_vector(res1);
    
    vector<int> nums2 = {7, 8, 6, 9};
    vector<int> res2 = sol.findMissingElements(nums2);
    cout << "Example 2 should be []: ";
    print_vector(res2);

    vector<int> nums3 = {5, 1};
    vector<int> res3 = sol.findMissingElements(nums3);
    cout << "Example 3 should be [2,3,4]: ";
    print_vector(res3);

    return 0;
}
