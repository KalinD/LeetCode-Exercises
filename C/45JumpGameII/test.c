#include <assert.h>
#include "45JumpGameII.h"

int main(int argc, char ** argv) {
    int nums1[] = {2, 3, 1, 1, 4};
    int res1 = jump(nums1, 5);
    assert(2 == res1);
    
    int nums2[] = {2, 3, 0, 1, 4};
    int res2 = jump(nums2, 5);
    assert(2 == res2);
    
    int nums3[] = {2, 1};
    int res3 = jump(nums3, 2);
    assert(1 == res3);
    
    int nums4[] = {1, 2, 1, 1, 1};
    int res4 = jump(nums4, 5);
    assert(3 == res4);
    
    int nums5[] = {3,4,3,2,5,4,3};
    int res5 = jump(nums5, 7);
    assert(3 == res5);
}
