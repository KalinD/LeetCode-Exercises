#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int red_count = 0; // 0
        int white_count = 0; // 1
        int blue_count = 0; // 2

        for (int num : nums) {
            if (0 == num){
                ++red_count;
            } else if (1 == num) {
                ++white_count;
            } else {
                ++blue_count;
            }
        }
        int index = 0;
        while (red_count > 0) {
            nums[index++] = 0;
            --red_count;
        }
        while (white_count > 0) {
            nums[index++] = 1;
            --white_count;
        }
        while (blue_count > 0) {
            nums[index++] = 2;
            --blue_count;
        }
    }
};
