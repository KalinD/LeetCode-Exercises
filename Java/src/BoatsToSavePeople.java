import java.util.Arrays;
import java.util.HashMap;

public class BoatsToSavePeople {
    /* My second solution
     * Got accepted, and it's fast and low memory
     */
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int count = 0;
        int high = people.length - 1, low = 0;
        while(high >= low){
            if(limit - people[high] > 0 && people[high] + people[low] <= limit ) {
                low++;
            }
            high--;
            count++;
        }

        return count;
    }
}
