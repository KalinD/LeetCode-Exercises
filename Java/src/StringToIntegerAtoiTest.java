import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerAtoiTest {
    StringToIntegerAtoi obj = new StringToIntegerAtoi();
    @Test
    void myAtoi() {
//        assertEquals(42, obj.myAtoi("42"));
//        assertEquals(-42, obj.myAtoi("   -42"));
//        assertEquals(4193, obj.myAtoi("4193 with words"));
//        assertEquals(0, obj.myAtoi("words and 987"));
//        assertEquals(0, obj.myAtoi("-+12"));
        assertEquals(2147483646, obj.myAtoi("2147483646"));
    }
}