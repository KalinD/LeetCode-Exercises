using System.Text;

namespace AddBinary;

public class Solution
{
    public string AddBinary(string a, string b)
    {
        StringBuilder sb = new();
        int aIndex = a.Length - 1, bIndex = b.Length - 1;
        bool hasCarry = false;
        while (aIndex >= 0 && bIndex >= 0)
        {
            if (a[aIndex] == '1' && b[bIndex] == '1')
            {
                sb.Insert(0, hasCarry ? '1' : '0');
                hasCarry = true;
            }
            else if (a[aIndex] == '0' && b[bIndex] == '0')
            {
                sb.Insert(0, hasCarry ? '1' : '0');
                hasCarry = false;
            }
            else
            {
                sb.Insert(0, hasCarry ? '0' : '1');
            }
            aIndex--;
            bIndex--;
        }

        while (aIndex >= 0)
        {
            if (hasCarry && a[aIndex] == '1')
            {
                sb.Insert(0, '0');
                hasCarry = true;
            }
            else if (hasCarry && a[aIndex] == '0')
            {
                sb.Insert(0, '1');
                hasCarry = false;
            }
            else
            {
                sb.Insert(0, a[aIndex]);
            }
            aIndex--;
        }

        while (bIndex >= 0)
        {
            if (hasCarry && b[bIndex] == '1')
            {
                sb.Insert(0, '0');
                hasCarry = true;
            }
            else if (hasCarry && b[bIndex] == '0')
            {
                sb.Insert(0, '1');
                hasCarry = false;
            }
            else
            {
                sb.Insert(0, b[bIndex]);
            }
            bIndex--;
        }

        if (hasCarry)
        {
            sb.Insert(0, '1');
        }

        return sb.ToString();
    }

    public static void Main(string[] args) { }
}