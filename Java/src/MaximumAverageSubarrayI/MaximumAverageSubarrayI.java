package MaximumAverageSubarrayI;

public class MaximumAverageSubarrayI {
    static public double findMaxAverage(int[] nums, int k) {
    	int currentSum = 0;
    	for(int i = 0; i < k; i++)
    		currentSum += nums[i];
    	int maxSum = currentSum;
        for(int i = 1; i < nums.length - k + 1; i++) {
        	currentSum -= nums[i - 1];
        	currentSum += nums[i + k - 1];
        	if(currentSum > maxSum)
        		maxSum = currentSum;
        }
        return maxSum / (double) k;
    }
}
