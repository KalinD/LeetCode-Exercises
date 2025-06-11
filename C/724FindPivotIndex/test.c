#include "724FindPivotIndex.h"
#include <assert.h>

int main(int argc, char ** argv) {
    int nums1[] = {1,7,3,6,5,6};
    int res1 = pivotIndex(nums1, 6);
    assert(3 == res1);

    int nums2[] = {1, 2, 3};
    int res2 = pivotIndex(nums2, 3);
    assert(-1 == res2);

    int nums3[] = {2, 1, -1};
    int res3 = pivotIndex(nums3, 3);
    assert(0 == res3);
}
