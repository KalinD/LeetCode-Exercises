#include "198HouseRobber.h"
int rob(int* nums, int numsSize) {
    if (numsSize == 1) return nums[0];
    else if (numsSize == 2) return nums[0] > nums[1] ? nums[0] : nums[1];
    int maxArray[numsSize];
    maxArray[0] = nums[0];
    maxArray[1] = nums[1];
    maxArray[2] = nums[2] + nums[0];

    for(int i = 3; i < numsSize; i++) {
        if(maxArray[i - 2] > maxArray[i - 3]) {
            maxArray[i] = nums[i] + maxArray[i - 2];
        } else {
            maxArray[i] = nums[i] + maxArray[i - 3];
        }
    }
    return maxArray[numsSize - 1] > maxArray[numsSize - 2] ? maxArray[numsSize - 1] : maxArray[numsSize - 2];
}
