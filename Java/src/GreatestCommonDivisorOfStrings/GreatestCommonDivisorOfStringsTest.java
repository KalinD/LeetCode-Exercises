package GreatestCommonDivisorOfStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorOfStringsTest {
    @Test
    public void example1(){
        String str1 = "ABCABC";
        String str2 = "ABC";
        String solution = "ABC";
        assertEquals(solution, GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2));
    }

    @Test
    public void example2(){
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String solution = "AB";
        assertEquals(solution, GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2));
    }

    @Test
    public void example3(){
        String str1 = "LEET";
        String str2 = "CODE";
        String solution = "";
        assertEquals(solution, GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2));
    }
}
