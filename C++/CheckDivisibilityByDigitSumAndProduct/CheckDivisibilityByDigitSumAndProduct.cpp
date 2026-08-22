class Solution {
public:
    bool checkDivisibility(int n) {
        long long sum = 0;
        long long prod = 1;
        int n_copy = n;

        while (n_copy > 0) {
            sum += (n_copy % 10);
            prod *= (n_copy % 10);
            n_copy /= 10;
        }
        
        return (n % (sum + prod)) == 0;
    }
};
