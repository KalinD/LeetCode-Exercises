package ReverseVowelsOfAString;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {
    // Faster
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(){{
            add('a'); add('A');
            add('e'); add('E');
            add('i'); add('I');
            add('o'); add('O');
            add('u'); add('U');
        }};
        char[] word = s.toCharArray();
        int start = 0, end = s.length() - 1;
        while(start < end){
            while(end > start && !vowels.contains(s.charAt(end))){
                end--;
            }
            while(start < end && !vowels.contains(s.charAt(start))){
                start++;
            }

            char tmp = word[start];
            word[start] = word[end];
            word[end] = tmp;

            start++;
            end--;
        }
        return new String(word);
    }

    // Less memory
    public static String reverseVowelsv1(String s) {
        Set<Character> vowels = new HashSet<>(){{
            add('a'); add('A');
            add('e'); add('E');
            add('i'); add('I');
            add('o'); add('O');
            add('u'); add('U');
        }};
        StringBuilder res = new StringBuilder();
        int j = s.length() - 1;
        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                while(!vowels.contains(s.charAt(j))){
                    j--;
                }
                res.append(s.charAt(j));
                j--;
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
