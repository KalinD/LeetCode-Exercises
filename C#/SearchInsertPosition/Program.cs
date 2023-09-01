namespace SearchInsertPosition;

public class Solution
{
    public int SearchInsert(int[] nums, int target)
    {
        int l = 0, r = nums.Length - 1;
        while (l <= r)
        {
            int middle = (l + r) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] < target) { 
                l = middle + 1;
            } else { 
                r = middle - 1;
            }

        }

        return l;
    }

    public static void Main(string[] args) { }
}