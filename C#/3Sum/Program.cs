namespace _3Sum;

public class Solution
{
    public IList<IList<int>> ThreeSum(int[] nums)
    {
        List<IList<int>> res = new();
        Array.Sort(nums);
        int start = 0;
        while (start < nums.Length - 2)
        {
            int l = start + 1, r = nums.Length - 1;
            while (l < r)
            {
                if (nums[l] + nums[r] + nums[start] < 0) { 
                    l++;
                } else if (nums[l] + nums[r] + nums[start] > 0) { 
                    r--;
                } else
                {
                    List<int> oneSolution = new() { nums[start], nums[l], nums[r] };
                    res.Add(oneSolution);
                    while (l < r && nums[l] == oneSolution[1]) l++;
                    while (l < r && nums[r] == oneSolution[2]) r--;
                }
            }
            int startNumber = nums[start];
            while(start < nums.Length - 2 && nums[start] == startNumber) start++;
        }
        return res;
    }

    // Too slow
    // Unoptimized
    public IList<IList<int>> ThreeSumv1(int[] nums)
    {
        List<IList<int>> res = new();
        Array.Sort(nums);
        HashSet<String> seen = new();
        int r = nums.Length - 1;
        while (r > 1)
        {
            int l = 0;
            while (l < r - 1)
            {
                int remaining = 0 - (nums[l] + nums[r]);
                for (int i = l + 1; i < r; i++)
                {
                    List<int> value = new() { nums[l], nums[i], nums[r] };
                    String hashValue = $"{nums[l]}, {nums[i]}";
                    if (nums[i] == remaining && !seen.Contains(hashValue))
                    {
                        res.Add(value);
                        seen.Add(hashValue);
                    }
                }
                l++;
            }
            r--;
        }
        Console.WriteLine(res.Capacity);
        return res;
    }

    public static void Main(string[] args) { }
}
