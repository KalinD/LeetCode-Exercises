namespace ClimbingStairs;

public class Solution
{
    public int ClimbStairs(int n)
    {
        if (n == 1) { 
            return 1;
        }
        int a = 1, b = 1;
        for(int i = 1; i < n; i++) { 
            int temp = a;
            a = b;
            b = a + temp;
        }
        return b;
    }

    public int ClimbStairsv1(int n)
    {
        if(n == 0 || n == 1) { 
            return 1;
        }
        return ClimbStairsv1(n - 1) + ClimbStairsv1(n - 2);
    }

    public static void Main(string[] args) { }
}