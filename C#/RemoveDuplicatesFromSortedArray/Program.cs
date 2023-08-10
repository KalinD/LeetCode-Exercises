// See https://aka.ms/new-console-template for more information
namespace RemoveDuplicateFromSortedArray
{
    public class Solution
    {
        public int RemoveDuplicates(int[] nums)
        {
            int index = 1;
            for (int i = 0; i < nums.Length - 1; i++)
            {
                if (nums[i] == nums[i + 1]) continue;
                nums[index] = nums[i + 1];
                index += 1;
            }
            return index;
        }
        public static void Main(string[] args) { }
    }
}
