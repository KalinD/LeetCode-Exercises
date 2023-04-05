import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    LongestCommonPrefix obj = new LongestCommonPrefix();
    @Test
    void longestCommonPrefixTest() {
        assertEquals("fl", obj.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", obj.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("a", obj.longestCommonPrefix(new String[]{"a"}));
        assertEquals("a", obj.longestCommonPrefix(new String[]{"a", "ab"}));
    }
}