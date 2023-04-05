import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {
    RomanToInteger obj = new RomanToInteger();

    @Test
    void romanToIntTest(){
        assertEquals(3, obj.romanToInt("III"));
        assertEquals(58, obj.romanToInt("LVIII"));
        assertEquals(1994, obj.romanToInt("MCMXCIV"));
        assertEquals(621, obj.romanToInt("DCXXI"));
    }

    @Test
    void romanToInt2Test(){
        assertEquals(3, obj.romanToInt2("III"));
        assertEquals(58, obj.romanToInt2("LVIII"));
        assertEquals(1994, obj.romanToInt2("MCMXCIV"));
        assertEquals(621, obj.romanToInt2("DCXXI"));
    }
}
