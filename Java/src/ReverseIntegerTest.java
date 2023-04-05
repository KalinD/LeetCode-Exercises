import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    ReverseInteger obj = new ReverseInteger();
    @Test
    void reverseTest(){
        assertEquals(321, obj.reverse(123));
        assertEquals(-321, obj.reverse(-123));
        assertEquals(21, obj.reverse(120));
        assertEquals(0, obj.reverse(1534236469));
        assertEquals(2147483641, obj.reverse(1463847412));
    }

}