import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueOfKCoinsFromPilesTest {
    MaximumValueOfKCoinsFromPiles obj = new MaximumValueOfKCoinsFromPiles();
    @Test
    void maxValueOfCoins() {
        List<List<Integer>> piles = Arrays.asList(Arrays.asList(1, 100, 3), Arrays.asList(7, 8, 9));
        assertEquals(101, obj.maxValueOfCoins(piles, 2));
        piles = Arrays.asList(List.of(100), List.of(100), List.of(100), List.of(100), List.of(100), List.of(100), Arrays.asList(1, 1, 1, 1, 1, 1, 100));
        assertEquals(706, obj.maxValueOfCoins(piles, 7));
    }
}