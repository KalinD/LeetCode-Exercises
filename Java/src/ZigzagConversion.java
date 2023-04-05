import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        List<List<Character>> rows = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            rows.add(new ArrayList<>());
        }
        boolean goingDown = true;
        int row = 0;
        for(int i = 0; i < s.length(); i++){
            rows.get(row).add(s.charAt(i));
            if(goingDown){
                row++;
                if (row == numRows){
                    row -= 2;
                    goingDown = !goingDown;
                }
            }
            else {
                row--;
                if(row == -1){
                    row += 2;
                    goingDown = !goingDown;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (row = 0; row < numRows; row++){
            for (char c: rows.get(row)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}