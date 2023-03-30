/* Initial solution
 * - slow 
 * - lots of memory */
var findMedianSortedArrays = function (nums1, nums2) {
  let combined = [];
  for (let i = 0, j = 0; i < nums1.length || j < nums2.length; ) {
    if (i == nums1.length) {
      combined = combined.concat(nums2.splice(j));
      break;
    }
    if (j == nums2.length) {
      combined = combined.concat(nums1.splice(i));
      break;
    }
    if (nums1[i] < nums2[j]) {
      combined = combined.concat(nums1[i]);
      i++;
    } else {
      combined = combined.concat(nums2[j]);
      j++;
    }
  }
  const halfLength = combined.length / 2;
  if (combined.length % 2 === 0) {
    return (
      (combined[halfLength - 1] + combined[halfLength]) / 2
    );
  }
  console.log(halfLength)
  return combined[Math.ceil(halfLength)];
};

console.log(findMedianSortedArrays([1, 2], [3, 4]));
