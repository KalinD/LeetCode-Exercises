package MinCostClimbingStairs;

import java.util.Arrays;

public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int l = cost.length;
        for(int i = 2; i < cost.length; i++){
            cost[i] = cost[i] + (Math.min(cost[i - 1], cost[i - 2]));
        }
        return Math.min(cost[l - 1], cost[l - 2]);
    }

    public static int minCostClimbingStairsv2(int[] cost) {
        int l = cost.length;
        int[] minimalCosts = new int[l];
        minimalCosts[0] = cost[0];
        minimalCosts[1] = cost[1];
        for(int i = 2; i < cost.length; i++){
            minimalCosts[i] = cost[i] + (Math.min(minimalCosts[i - 1], minimalCosts[i - 2]));
        }
        return Math.min(minimalCosts[l - 1], minimalCosts[l - 2]);
    }

    // Too slow
    public static int minCostClimbingStairsv1(int[] cost) {
        if(cost.length == 0 || cost.length == 1){
            return 0;
        }
        int oneStepCost = cost[0] + minCostClimbingStairs(Arrays.stream(cost).skip(1).toArray());
        int twoStepCost = cost[1] + minCostClimbingStairs(Arrays.stream(cost).skip(2).toArray());
        return Math.min(oneStepCost, twoStepCost);
    }
}
