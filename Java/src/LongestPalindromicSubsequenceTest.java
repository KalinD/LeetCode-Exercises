import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubsequenceTest {
    LongestPalindromicSubsequence obj = new LongestPalindromicSubsequence();
    @Test
    void longestPalindromeSubseq() {
        assertEquals(4, obj.longestPalindromeSubseq("bbbab"));
        assertEquals(2, obj.longestPalindromeSubseq("cbbd"));
        assertEquals(2, obj.longestPalindromeSubseq("cbbdaef"));
        assertEquals(1, obj.longestPalindromeSubseq("a"));
        assertEquals(5, obj.longestPalindromeSubseq("aabaa"));
        assertEquals(3, obj.longestPalindromeSubseq("abab"));
        assertEquals(159, obj.longestPalindromeSubseq("euazbipzncptldueeuechubrcourfpftcebikrxhybkymimgvldiwqvkszfycvqyvtiwfckexmowcxztkfyzqovbtmzpxojfofbvwnncajvrvdbvjhcrameamcfmcoxryjukhpljwszknhiypvyskmsujkuggpztltpgoczafmfelahqwjbhxtjmebnymdyxoeodqmvkxittxjnlltmoobsgzdfhismogqfpfhvqnxeuosjqqalvwhsidgiavcatjjgeztrjuoixxxoznklcxolgpuktirmduxdywwlbikaqkqajzbsjvdgjcnbtfksqhquiwnwflkldgdrqrnwmshdpykicozfowmumzeuznolmgjlltypyufpzjpuvucmesnnrwppheizkapovoloneaxpfinaontwtdqsdvzmqlgkdxlbeguackbdkftzbnynmcejtwudocemcfnuzbttcoew"));
    }
}