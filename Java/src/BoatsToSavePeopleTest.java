import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoatsToSavePeopleTest {
    private BoatsToSavePeople obj = new BoatsToSavePeople();
    @Test
    void longestPalindromeTest() {
        assertEquals(1, obj.numRescueBoats(new int[]{1, 2}, 3));
        assertEquals(3, obj.numRescueBoats(new int[]{3, 2, 2, 1}, 3));
        assertEquals(4, obj.numRescueBoats(new int[]{3, 5, 3, 4}, 5));
    }
}
