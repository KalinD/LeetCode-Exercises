#include "45JumpGameII.h"

int jump(int* nums, int numsSize) {
    int jumpArray[numsSize];
    int lastCheckedPosition = 0;
    jumpArray[0] = 0;

    for (int i = 0; i < numsSize - 1; ++i) {
        for(int jumpOffset = 1; jumpOffset <= nums[i] && (jumpOffset + i) < numsSize; ++jumpOffset) {
            if(jumpArray[i + jumpOffset] > jumpArray[i] + 1 || lastCheckedPosition < i + jumpOffset){
                jumpArray[i + jumpOffset] = jumpArray[i] + 1;
            }
        }
        lastCheckedPosition = i + nums[i] > lastCheckedPosition ? i + nums[i] : lastCheckedPosition;
    }

    return jumpArray[numsSize - 1];
}
