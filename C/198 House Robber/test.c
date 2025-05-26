#include "198HouseRobber.h"
#include <assert.h>

int main(int argc, char ** argv) {
    int nums1[] = {1,2,3,1};
    int res1 = rob(nums1, 4);
    assert(res1 == 4);
    
    int nums2[] = {2,7,9,3,1};
    int res2 = rob(nums2, 5);
    assert(res2 == 12);
    
    int nums3[] = {0,0};
    int res3 = rob(nums3, 2);
    assert(res3 == 0);
}
