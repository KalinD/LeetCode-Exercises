package ReverseWordsInAString;

import java.util.*;

public class ReverseWordsInAString {

    public static String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    public static String reverseWordsv2(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        List<String> res = new ArrayList<>();
        for (int i = words.size() - 1; i >= 0; i--) {
            res.add(words.get(i));
        }
        return String.join(" ", res);
    }

    public static String reverseWordsv1(String s) {
        List<String> words = Arrays.asList(s.split(" "));
        List<String> res = new ArrayList<>();
        for (int i = words.size() - 1; i >= 0; i--) {
            if (!words.get(i).isEmpty()) {
                res.add(words.get(i));
            }
        }
        return String.join(" ", res);
    }
}
