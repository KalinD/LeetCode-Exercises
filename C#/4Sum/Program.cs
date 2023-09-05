namespace _4Sum;

public class Solution
{
    public IList<IList<int>> FourSum(int[] nums, int target)
    {
        List<IList<int>> result = new();
        Array.Sort(nums);
        int start = 0;
        while (start < nums.Length - 3)
        {
            int end = nums.Length - 1;
            while (end > 2)
            {
                int l = start + 1, r = end - 1;
                while (l < r)
                {
                    long s = (long) nums[start] + (long) nums[l] + (long) nums[r] + (long) nums[end];
                    if (s < target)
                    {
                        l++;
                    }
                    else if (s > target)
                    {
                        r--;
                    }
                    else
                    {
                        List<int> temp = new() { nums[start], nums[l], nums[r], nums[end] };
                        result.Add(temp);
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    }
                }
                while (end > 2 && nums[end] == nums[end - 1]) end--;
                end--;
            }
            while (start < nums.Length - 3 && nums[start] == nums[start + 1]) start++;
            start++;
        }

        return result;
    }

    public static void Main(string[] args) { }
}