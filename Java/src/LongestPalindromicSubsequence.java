public class LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        int[][] memo = new int[s.length()][s.length()];
        return lps(s, 0, s.length() - 1, memo);
    }

    private int lps(String s, int start, int end, int[][] memo) {
        if (memo[start][end] != 0) {
            return memo[start][end];
        }
        if (start == end) {
            return 1;
        } else if (start > end) {
            return 0;
        }
        if (s.charAt(start) == s.charAt(end)) {
            memo[start][end] = 2 + lps(s, start + 1, end - 1, memo);
        }else {
            int first = lps(s, start + 1, end, memo);
            int second = lps(s, start, end - 1, memo);
            memo[start][end] = Math.max(first, second);
        }
        return memo[start][end];
    }
}
