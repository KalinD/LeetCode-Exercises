using System.Security;
using System.Text;

namespace GenerateParentheses;

public class Solution
{
    public IList<string> GenerateParenthesis(int n)
    {
        List<string> res = new();
        Helper(n, res, "(", 1, 0);
        return res;
    }

    public void Helper(int n, IList<string> res, string current, int open, int close) { 
        if(current.Length == n * 2) { 
            res.Add(current);
            return;
        }
        if(open < n) { 
            Helper(n, res, current + "(", open + 1, close);
        }
        if(close < open) { 
            Helper(n, res, current + ")", open, close + 1);
        }
    }


    public static void Main(string[] args) { }
}