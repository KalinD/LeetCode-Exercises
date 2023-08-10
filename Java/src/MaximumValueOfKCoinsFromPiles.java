import java.util.List;

public class MaximumValueOfKCoinsFromPiles {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int max = 0;
        for(int pile = 0; pile < piles.size(); pile++){
            int toSkip = 0;
            int sum = 0;
            for(int i = pile; i < k; i++){
                for(int j = 0; j < piles.get(pile).size(); j++){
                    sum += piles.get(i).get(j);
                }
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
