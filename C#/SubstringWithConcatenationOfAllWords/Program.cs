using System.Linq;

namespace SubstringWithConcatenationOfAllWords;

public class Solution
{
    public IList<int> FindSubstring(string s, string[] words)
    {
        int singleWordLength = words[0].Length;
        List<int> res = new List<int>();
        if(s.Length < singleWordLength * words.Length) { 
            return res;
        }

        HashSet<string> seendWords = new();

        for(int i = 0; i < s.Length; i += singleWordLength) { 
            string currentWord = s.Substring(i, singleWordLength);
            if (!seendWords.Contains(currentWord)) {
                seendWords.Add(currentWord);
                if(seendWords.Count == words.Length) { 
                    res.Add(i - (singleWordLength * (seendWords.Count - 1)));
                    seendWords.Clear();
                }
            } else { 
                seendWords.Clear()
            }
        }

        return res;
    }
}