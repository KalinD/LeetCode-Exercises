package MinCostClimbingStairs;

import org.junit.jupiter.api.Test;

import static MinCostClimbingStairs.MinCostClimbingStairs.minCostClimbingStairs;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCostClimbingStairsTest {
    @Test
    public void example1(){
        int[] cost = new int[]{10,15,20};
        int output = 15;
        assertEquals(output, minCostClimbingStairs(cost));
    }

    @Test
    public void example2(){
        int[] cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        int output = 6;
        assertEquals(output, minCostClimbingStairs(cost));
    }
}
