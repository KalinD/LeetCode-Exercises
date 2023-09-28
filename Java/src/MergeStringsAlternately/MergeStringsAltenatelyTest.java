package MergeStringsAlternately;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAltenatelyTest {
    @Test
    public void example1(){
        String word1 = "abc";
        String word2 = "pqr";
        String solution = "apbqcr";
        assertEquals(solution, MergeStringsAltenately.mergeAlternately(word1, word2));
    }

    @Test
    public void example2(){
        String word1 = "ab";
        String word2 = "pqrs";
        String solution = "apbqrs";
        assertEquals(solution, MergeStringsAltenately.mergeAlternately(word1, word2));
    }

    @Test
    public void example3(){
        String word1 = "abcd";
        String word2 = "pq";
        String solution = "apbqcd";
        assertEquals(solution, MergeStringsAltenately.mergeAlternately(word1, word2));
    }
}

