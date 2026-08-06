#include <iostream>

using namespace std;

class Solution {
public:
    int smallestNumber(int n, int t) {
        for (int i = n; i != 0; ++i) {
            const int current_i = i;
            int temp = i;
            int prod = 1;
            while (0 != temp) {
                prod *= (temp % 10);
                temp /= 10;
            }
            
            if (prod % t == 0) {
                if (current_i < n) {
                    return n;
                }
                return current_i;
            }
        }
        return n;
    }
};

int main() {
    Solution sol;
    cout << "Example 1 should be 10: " << sol.smallestNumber(10, 2) << endl;
    cout << "Example 2 should be 16: " << sol.smallestNumber(15, 3) << endl;

    return 1;
}
