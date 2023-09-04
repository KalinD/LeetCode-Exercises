namespace RegularExpressionMatching;

public class Solution
{
    public bool IsMatch(string s, string p)
    {
        if (p.Length == 0) return s.Length == 0;
        bool firstCharMatch = s.Length > 0 && (p[0] == s[0] || p[0] == '.');
        if (p.Length > 1 && p[1] == '*')
        {
            return IsMatch(s, p.Substring(2)) ||
                (firstCharMatch && IsMatch(s.Substring(1), p));
        }
        else { return firstCharMatch && IsMatch(s.Substring(1), p.Substring(1)); }
    }
    public bool IsMatchv1(string s, string p)
    {
        int sIndex = s.Length - 1, pIndex = p.Length - 1;
        while (sIndex >= 0 && pIndex >= 0)
        {
            if (pIndex - 1 >= 0 && p[pIndex] == '*')
            {
                if (p[pIndex - 1] == '.')
                {
                    sIndex = -1;
                    pIndex -= 2;
                    break;
                }
                while (sIndex >= 0 && s[sIndex] == p[pIndex - 1]) sIndex--;
                pIndex -= 2;
                continue;
            }
            if (p[pIndex] == '.')
            {
                sIndex--;
                pIndex--;
                continue;
            }
            if (s[sIndex] != p[pIndex])
            {
                return false;
            }
            sIndex--;
            pIndex--;
        }
        while (pIndex > 0 && p[pIndex] == '*')
        {
            pIndex -= 2;
        }
        if (sIndex != -1 || pIndex != -1) return false;
        return true;
    }

    public static void Main(string[] args) { }
}
