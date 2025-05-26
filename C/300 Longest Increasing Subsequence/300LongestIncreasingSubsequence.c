#include "300LongestIncreasingSubsequence.h"
#include <stdio.h>

int lengthOfLIS(int* nums, int numsSize) {
    if (numsSize == 1) return 1;
    int longest[numsSize];
    longest[0] = 1;
    for(int i = 1; i < numsSize; i++) {
        int prev = i - 1;
        int maxPrev = 0;
        while (prev >= 0) {
            if(nums[i] > nums[prev] && longest[prev] > maxPrev) {
                maxPrev = longest[prev];
                longest[i] = longest[prev] + 1;
            }
            prev--;
        }
        if(maxPrev == 0) {
            longest[i] = 1;
        }
    }

    int max = longest[0];
    for(int i = 0; i < numsSize; i++) {
        if(longest[i] > max) {
            max = longest[i];
        }
    }

    return max;
}
