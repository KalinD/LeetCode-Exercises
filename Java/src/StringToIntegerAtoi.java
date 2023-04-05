public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        boolean isNeg = false;
        int res = 0;
        int index = 0;
        //Remove whitespace
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        if (index < s.length() && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            if(s.charAt(index) == '-') {
                isNeg = true;
            }
            index++;
        }


        while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            int value = s.charAt(index) - '0';
            if (res > (Integer.MAX_VALUE - value) / 10) {
                if (isNeg) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
            res = res * 10 + value;
            index++;
        }

        if (isNeg) {
            return -res;
        }

        return res;
    }
}
