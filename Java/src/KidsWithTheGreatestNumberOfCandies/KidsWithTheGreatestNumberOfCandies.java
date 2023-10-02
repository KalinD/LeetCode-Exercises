package KidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (m < candies[i]) {
                m = candies[i];
            }
        }
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            res.add(candies[i] + extraCandies >= m);
        }
        return res;
    }
}
