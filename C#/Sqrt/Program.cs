namespace Sqrt;

public class Solution
{
    public int MySqrt(int x)
    {
        if (x == 0 || x == 1)
        {
            return x;
        }
        double guess = x / 2.0;
        while(Math.Abs(x - guess * guess) > 0.01) { 
            guess = (guess + x / guess) / 2; 
        }
        return (int)Math.Floor(guess);
    }

    public static void Main(string[] args) { }
}