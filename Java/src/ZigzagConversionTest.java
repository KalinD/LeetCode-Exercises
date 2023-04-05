import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {
    ZigzagConversion obj = new ZigzagConversion();
    @Test
    void convert() {
        assertEquals("PAHNAPLSIIGYIR", obj.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", obj.convert("PAYPALISHIRING", 4));
        assertEquals("A", obj.convert("A", 1));
    }
}