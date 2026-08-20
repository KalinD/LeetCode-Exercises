#include <vector>

using namespace std;

class Solution {
public:
    vector<int> resultArray(vector<int>& nums) {
        vector<int> arr1;
        vector<int> arr2;

        arr1.push_back(nums.at(0));
        arr2.push_back(nums.at(1));

        int i = 2;
        while (i < nums.size()) {
            if (arr1.at(arr1.size() - 1) > arr2.at(arr2.size() - 1)) {
                arr1.push_back(nums.at(i));
            } else {
                arr2.push_back(nums.at(i));
            }
            ++i;
        }

        if (arr1.size() < arr2.size()) {
            for(int j = 0; j < arr1.size(); ++j) {
                arr2.insert(arr2.begin() + j, arr1.at(j));
            }
            return arr2;
        } else {
            for(int j = 0; j < arr2.size(); ++j) {
                arr1.push_back(arr2.at(j));
            }
            return arr1;
        }
    }
};
