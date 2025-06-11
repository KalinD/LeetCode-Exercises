#include "1732FindTheHighestAltitude.h"
#include <assert.h>

int main(int argc, char ** argv) {
    int gain1[] = {-5,1,5,0,-7};
    int res1 = largestAltitude(gain1, 5);
    assert(1 == res1);

    int gain2[] = {-4,-3,-2,-1,4,3,2};
    int res2 = largestAltitude(gain2, 7);
    assert(0 == res2);
}
