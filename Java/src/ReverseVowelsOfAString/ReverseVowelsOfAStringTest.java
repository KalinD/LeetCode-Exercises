package ReverseVowelsOfAString;

import org.junit.jupiter.api.Test;

import static ReverseVowelsOfAString.ReverseVowelsOfAString.reverseVowels;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseVowelsOfAStringTest {
    @Test
    public void example1(){
        String s = "hello";
        String output = "holle";
        assertEquals(output, reverseVowels(s));
    }

    @Test
    public void example2(){
        String s = "leetcode";
        String output = "leotcede";
        assertEquals(output, reverseVowels(s));
    }

    @Test
    public void example3(){
        String s = "aA";
        String output = "Aa";
        assertEquals(output, reverseVowels(s));
    }
}
