package MaxConsecutiveOnesIII;

public class MaxConsecutiveOnesIII {
	/*
	 * Copied from solution! Start (left) stays in place every time the rules
	 * (number of zeros between start and end (right)) is less or equal to k.
	 * Otherwise, it follows end. This will persist the longest distance between
	 * them that followed the rules (in this case what was asked in the exercise).
	 */
	public int longestOnesCopy(int[] nums, int k) {
        int start=0;
        int end=0;
        int zeros=0;

        while(end<nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            end++;
            if(zeros>k){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }
        }
        return end-start;
    }
	
	static public int longestOnes(int[] nums, int k) {
		int left = 0;
		int zeros = 0;

		for (int right = 0; right < nums.length; right++) {
			if (nums[right] == 0) {
				zeros++;
			}
			if (zeros > k) {
				if (nums[left] == 0) {
					zeros--;
				}
				left++;
			}
		}
		return nums.length - left;
	}

	// Still to slow for last cases
	public int longestOnesTry2(int[] nums, int k) {
		if (k >= nums.length)
			return k;
		int totalZeros = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == 0)
				totalZeros++;
		int longest = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i - 1] == 0)
				totalZeros--;
			int currentZeros = totalZeros;
			for (int j = nums.length - 1; j > i; j--) {
				if (j + 1 < nums.length && nums[j + 1] == 0)
					currentZeros--;
				if (currentZeros <= k && j - i + 1 > longest)
					longest = j - i + 1;
			}
		}
		return longest;
	}

	// Too slow
	public int longestOnesTry1(int[] nums, int k) {
		if (k >= nums.length)
			return k;
		int longest = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length - 1; j > i; j--) {
				int countZeros = 0;
				for (int l = i; l <= j; l++) {
					if (nums[l] == 0) {
						countZeros++;
					}
				}
				if (countZeros <= k && j - i + 1 > longest)
					longest = j - i + 1;
			}
		}
		return longest;
	}
}
