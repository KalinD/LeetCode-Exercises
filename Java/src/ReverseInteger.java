public class ReverseInteger {
    public int reverse(int x) {
        boolean neg = x < 0;
        if(neg){
            x = -x;
        }
        int res = 0;
        while(x > 0){
            int prevRes = res;
            try {
                res = Math.addExact(Math.multiplyExact(res, 10), x % 10);
            } catch(ArithmeticException e) {
                return 0;
            }
            x /= 10;
        }
        if(neg){
            return  -res;
        }
        return res;
    }

    public int reverse2(int x) {
        boolean neg = x < 0;
        if(neg){
            x = -x;
        }
        int res = 0;
        while(x > 0){
            if (res > (Integer.MAX_VALUE - x % 10) /10){
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }
        if(neg){
            return  -res;
        }
        return res;
    }
}
