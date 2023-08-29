// See https://aka.ms/new-console-template for more information
namespace RemoveElement;

public class Solution
{
    public int RemoveElement(int[] nums, int val)
    {
        int lastIndex = nums.Length - 1;
        int i = 0;
        while(i <= lastIndex) {
            if (nums[i] == val)
            {
                nums[i] = nums[lastIndex];
                nums[lastIndex] = val;
                lastIndex--;
                continue;
            }
            i++;
        }
        return lastIndex + 1;
    }

    public static void Main(string[] args) { }
}