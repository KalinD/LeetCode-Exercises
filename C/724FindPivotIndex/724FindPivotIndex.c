#include "724FindPivotIndex.h"

int pivotIndex(int* nums, int numsSize) {
    int sumsLeft[numsSize];
    int sumsRight[numsSize];
    
    sumsLeft[0] = 0;
    for(int i = 1; i < numsSize; ++i) {
        sumsLeft[i] = sumsLeft[i - 1] + nums[i - 1];
    }

    sumsRight[numsSize - 1] = 0;
    for(int i = numsSize - 2; i >= 0; --i) {
        sumsRight[i] = sumsRight[i + 1] + nums[i + 1];
    }

    for(int i = 0; i < numsSize; ++i) {
        if (sumsLeft[i] == sumsRight[i]) return i;
    }

    return -1;
}
