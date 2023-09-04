namespace _3SumClosest;

public class Solution
{
    public int ThreeSumClosest(int[] nums, int target)
    {
        int start = 0;
        int closest = 0;
        bool isInitial = true;
        Array.Sort(nums);
        while (start < nums.Length - 2)
        {
            int left = start + 1;
            int right = nums.Length - 1;
            if (isInitial)
            {
                closest = nums[start] + nums[left] + nums[right];
                isInitial = false;
            }
            while (left < right)
            {
                int s = nums[start] + nums[left] + nums[right];
                if (Math.Abs(target - s) < Math.Abs(target - closest))
                {
                    closest = s;
                }
                if(target - s < 0)
                {
                    right--;
                } else if (target - s > 0) { 
                    left++;
                }
                else { 
                    return target;
                }
            }
            start++;
        }
        return closest;
    }

    public static void Main(string[] args) { }
}