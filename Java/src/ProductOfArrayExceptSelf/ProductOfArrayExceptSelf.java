package ProductOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int cumulative = 1;
        res[0] = 1;
        for(int i = 1; i < res.length; i++){
            res[i] = nums[i - 1] * cumulative;
            cumulative = nums[i - 1] * cumulative;
        }

        cumulative = 1;
        for(int i = res.length - 1; i >= 0; i--){
            res[i] = res[i] * cumulative;
            cumulative = nums[i] * cumulative;
        }

        return res;
    }
}
