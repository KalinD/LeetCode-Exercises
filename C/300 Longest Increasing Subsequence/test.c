#include "300LongestIncreasingSubsequence.h"
#include <assert.h>
#include <stdio.h>

int main(int argc, char ** argv) {
    int nums1[] = {10,9,2,5,3,7,101,18};
    int res1 = lengthOfLIS(nums1, 8);
    assert(4 == res1);

    int nums2[] = {0,1,0,3,2,3};
    int res2 = lengthOfLIS(nums2, 6);
    assert(4 == res2);
    
    int nums3[] = {7,7,7,7,7,7,7};
    int res3 = lengthOfLIS(nums3, 7);
    assert(1 == res3);
}
