import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt2(String s) {
        HashMap<Character, Integer> symbolToValue = new HashMap<>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            if (i + 1 < s.length() && symbolToValue.get(s.charAt(i)) < symbolToValue.get(s.charAt(i + 1))){
                res -= symbolToValue.get(s.charAt(i));
            } else{
                res += symbolToValue.get(s.charAt(i));
            }
        }
        return res;
    }

    /* Initial and better solution
     * less memory and faster than alternative.
     */
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                        res += 4;
                        i++;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                        res += 9;
                        i++;
                    } else {
                        res += 1;
                    }
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                        res += 40;
                        i++;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                        res += 90;
                        i++;
                    } else {
                        res += 10;
                    }
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                        res += 400;
                        i++;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                        res += 900;
                        i++;
                    } else {
                        res += 100;
                    }
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
            }
        }
        return res;
    }
}
