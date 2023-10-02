package KidsWithTheGreatestNumberOfCandies;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static KidsWithTheGreatestNumberOfCandies.KidsWithTheGreatestNumberOfCandies.kidsWithCandies;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KidsWithTheGreatestNumberOfCandiesTest {
    @Test
    public void example1() {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> output = new ArrayList<>() {{
            add(true);
            add(true);
            add(true);
            add(false);
            add(true);
        }};

        assertEquals(output, kidsWithCandies(candies, extraCandies));
    }

    @Test
    public void example2() {
        int[] candies = new int[]{4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> output = new ArrayList<>() {{
            add(true);
            add(false);
            add(false);
            add(false);
            add(false);
        }};

        assertEquals(output, kidsWithCandies(candies, extraCandies));
    }

    @Test
    public void example3() {
        int[] candies = new int[]{12,1,12};
        int extraCandies = 10;
        List<Boolean> output = new ArrayList<>() {{
            add(true);
            add(false);
            add(true);
        }};

        assertEquals(output, kidsWithCandies(candies, extraCandies));
    }
}
