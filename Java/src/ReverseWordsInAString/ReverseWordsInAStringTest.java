package ReverseWordsInAString;

import org.junit.jupiter.api.Test;

import static ReverseWordsInAString.ReverseWordsInAString.reverseWords;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInAStringTest {
    @Test
    public void example1(){
        String s = "the sky is blue";
        String output = "blue is sky the";
        assertEquals(output, reverseWords(s));
    }

    @Test
    public void example2(){
        String s = "  hello world  ";
        String output = "world hello";
        assertEquals(output, reverseWords(s));
    }

    @Test
    public void example3(){
        String s = "a good   example";
        String output = "example good a";
        assertEquals(output, reverseWords(s));
    }
}
