package CanPlaceFlowers;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int canPlace = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i + 1 < flowerbed.length && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                canPlace++;
                i++;
            } else if (flowerbed[i] == 1) {
                i++;
            } else if (i == flowerbed.length - 1) {
                canPlace++;
            }
            if(canPlace >= n){
                return true;
            }
        }

        return canPlace >= n;
    }
}
