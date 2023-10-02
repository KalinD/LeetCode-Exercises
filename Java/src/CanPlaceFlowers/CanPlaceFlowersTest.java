package CanPlaceFlowers;

import org.junit.jupiter.api.Test;

import static CanPlaceFlowers.CanPlaceFlowers.canPlaceFlowers;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanPlaceFlowersTest {
    @Test
    public void example1(){
        int[] flowerbed = new int[]{1,0,0,0,1};
        int n = 1;
        assertTrue(canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void example2(){
        int[] flowerbed = new int[]{1,0,0,0,1};
        int n = 2;
        assertFalse(canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void example3(){
        int[] flowerbed = new int[]{0,0,1,0,1};
        int n = 1;
        assertTrue(canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void example4(){
        int[] flowerbed = new int[]{1,0,0,0,1,0,0};
        int n = 2;
        assertTrue(canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void example5(){
        int[] flowerbed = new int[]{0};
        int n = 1;
        assertTrue(canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void example6(){
        int[] flowerbed = new int[]{1, 0};
        int n = 1;
        assertFalse(canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void example7(){
        int[] flowerbed = new int[]{0, 0};
        int n = 2;
        assertFalse(canPlaceFlowers(flowerbed, n));
    }
}
