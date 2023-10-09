package ProductOfArrayExceptSelf;

import org.junit.jupiter.api.Test;

import static ProductOfArrayExceptSelf.ProductOfArrayExceptSelf.productExceptSelf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductOfArrayExceptSelfTest {
    @Test
    public void example1(){
        int[] nums = new int[]{1,2,3,4};
        int[] output = new int[]{24,12,8,6};
        int[] res = productExceptSelf(nums);
        assertEquals(output.length, res.length);
        for(int i = 0; i < output.length; i++) {
            assertEquals(output[i], res[i]);
        }
    }

    @Test
    public void example2(){
        int[] nums = new int[]{-1,1,0,-3,3};
        int[] output = new int[]{0,0,9,0,0};
        int[] res = productExceptSelf(nums);
        assertEquals(output.length, res.length);
        for(int i = 0; i < output.length; i++) {
            assertEquals(output[i], res[i]);
        }
    }
}
