namespace PlusOne;

public class Solution
{
    public int[] PlusOne(int[] digits)
    {
        int carry = 0;
        for (int i = digits.Length - 1; i >= 0; i--)
        {
            if (i == digits.Length - 1)
            {
                int s = digits[i] + 1;
                digits[i] = s % 10;
                carry = s / 10;
            }
            else
            {
                int s = digits[i] + carry;
                digits[i] = s % 10;
                carry = s / 10;

            }
            if (carry == 0)
            {
                return digits;
            }
        }
        int[] result = new int[digits.Length + 1];
        result[0] = carry;
        for (int i = 1; i < result.Length; i++)
        {
            result[i] = digits[i - 1];
        }

        return result;
    }

    public static void Main(string[] args) { }
}