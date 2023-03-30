/* Optimized solution
 * - fast
 * - small amount of memory */
var twoSum = function(nums, target) {
    const indeces = {};
    for(let i = 0; i < nums.length; i++){
        if(indeces[nums[i]] === undefined) indeces[target - nums[i]] = i;
        else return [indeces[nums[i]], i];
    }
};

/* Initial solution
 * - slower
 * - uses more memory */
var twoSum = function(nums, target) {
    for(let i = 0; i < nums.length - 1; i++){
        for(let j = i + 1; j < nums.length; j++){
            if (nums[i] + nums[j] == target){
                return [i, j]
            }
        }
    }
};
