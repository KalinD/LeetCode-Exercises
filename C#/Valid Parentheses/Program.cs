public class Solution
{
    public enum BracketType
    {
        Parentheses, // ()
        SquareBrackets, // []
        Braces // {}
    }
    public bool IsValid(string s)
    {
        if (s == null || s.Length < 2) return false;
        Stack<BracketType> bracketsStack = new Stack<BracketType>();
        for (int i = 0; i < s.Length; i++) {
            if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
                bracketsStack.Push(GetTypeOfLastParentheses(s[i]));
                continue;
            }
            if (bracketsStack.Count > 0 && bracketsStack.Peek().Equals(GetTypeOfLastParentheses(s[i])))
            {
                bracketsStack.Pop();
            }
            else {
                return false;
            }
        }

        return bracketsStack.Count == 0;
    }

    public BracketType GetTypeOfLastParentheses(char p)
    {
        switch (p)
        {
            case '(':
            case ')':
                return BracketType.Parentheses;
            case '[':
            case ']':
                return BracketType.SquareBrackets;
            default:
                return BracketType.Braces;

        }
    }
}