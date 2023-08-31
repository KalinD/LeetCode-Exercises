namespace FindTheIndexOfTheFirstOccurrenceInAString;

public class Solution
{
    public int StrStr(string haystack, string needle)
    {
        for(int i = 0; i < haystack.Length && i + needle.Length <= haystack.Length; i++) { 
            for (int j = 0; j < needle.Length; j++) {
                if (haystack[i + j] != needle[j]) { 
                    break;
                }
                if(j + 1 == needle.Length)
                {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void Main(string[] args) { }
}