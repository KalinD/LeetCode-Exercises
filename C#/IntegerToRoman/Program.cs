using System.Text;

namespace IntegerToRoman;

public class Solution
{
    public string IntToRoman(int num)
    {
        StringBuilder sb = new();
        int i = 0;
        while (num > 0)
        {
            Console.WriteLine(num % Math.Pow(10, i + 1));
            int currentNumber = (int)(num % Math.Pow(10, i + 1));
            sb.Insert(0, NumberToRoman(currentNumber));
            num -= currentNumber;
            i++;
        }

        return sb.ToString();
    }

    public string NumberToRoman(int number)
    {
        if (number <= 0) return "";
        StringBuilder sb = new();
        if (number >= 1000)
        {
            sb.Append('M', (number / 1000));
        }
        else if (number >= 500)
        {
            if (number == 900)
            {
                sb.Append("CM");
            }
            else
            {
                sb.Append("D");
                sb.Append(NumberToRoman(number - 500));
            }
        }
        else if (number >= 100)
        {
            if (number == 400)
            {
                sb.Append("CD");
            }
            else
            {
                sb.Append('C', number / 100);
            }
        }
        else if (number >= 50)
        {
            if (number == 90)
            {
                sb.Append("XC");
            }
            else
            {
                sb.Append("L");
                sb.Append(NumberToRoman(number - 50));
            }
        }
        else if (number >= 10)
        {
            if (number == 40)
            {
                sb.Append("XL");
            }
            else
            {
                sb.Append('X', number / 10);
            }
        }
        else if (number >= 5)
        {
            if (number == 9)
            {
                sb.Append("IX");
            }
            else
            {
                sb.Append("V");
                sb.Append(NumberToRoman(number - 5));
            }
        }
        else
        {
            if (number == 4)
            {
                sb.Append("IV");
            }
            else
            {
                sb.Append('I', number);
            }
        }

        return sb.ToString();
    }

    public static void Main(string[] args) { }
}