import com.sun.tools.jconsole.JConsoleContext;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length, m = potions.length;
        int[] res = new int[n];
        Arrays.sort(potions);
        int maxPotion = potions[m - 1];
        for(int i = 0; i < n; i++){
            long minPotion = (long) Math.ceil((1.0 * success) / spells[i]);
            if (minPotion > maxPotion){
                continue;
            }
            int l = 0, r = m;
            while(l < r){
                int mid = l + (r - l) / 2;
                if(potions[mid] < minPotion) {
                    l = mid + 1;
                }else {
                    r = mid;
                }
            }
            res[i] = m - l;
        }

        return res;
    }

    public int[] slow(int[] spells, int[] potions, long success){
        int n = spells.length, m = potions.length;
        float s = (float) success;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (s / spells[i] <= potions[j]) res[i]++;
            }
        }
        return res;
    }
}
