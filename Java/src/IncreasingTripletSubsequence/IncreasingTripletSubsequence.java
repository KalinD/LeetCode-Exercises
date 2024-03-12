package IncreasingTripletSubsequence;

public class IncreasingTripletSubsequence {
	public static boolean increasingTriplet(int[] nums) {
		if(nums.length < 3)
			return false;
		int smallest = nums[0];
		boolean[] hasSmallerBefore = new boolean[nums.length];
		for (int i = 1; i < nums.length; i++) {
			if(smallest < nums[i]) {
				hasSmallerBefore[i] = true;
			} else {
				smallest = nums[i];
			}
		}
		int lasrgest = nums[nums.length - 1];
		boolean[] hasLargerAfter = new boolean[nums.length];
		for (int i = nums.length - 2; i >= 0; i--) {
			if(lasrgest > nums[i]) {
				hasLargerAfter[i] = true;
			} else {
				lasrgest = nums[i];
			}
		}
		for(int i = 0; i < nums.length; i++) {
			if(hasSmallerBefore[i] && hasLargerAfter[i])
				return true;
		}
		return false;
	}
	
	private boolean betterSolution(int[] nums) {
		if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }
        
        return false;
	}
}
