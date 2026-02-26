#include <string>
#include <iostream>

using namespace std;

class Solution {
public:
    /* Given the binary representation of an integer as a string s, return the number of steps to reduce it to 1 under the following rules:
     * If the current number is even, you have to divide it by 2.
     * If the current number is odd, you have to add 1 to it.
     * It is guaranteed that you can always reach one for all test cases. */
    static int numSteps(string s) {
        int result = 0;

        while (s != "1") {
            size_t position = s.size() - 1U;
            size_t tempPosition = position;
            while(s.at(tempPosition) == '0') {
                tempPosition--;
            }
            result += position - tempPosition;
            position = tempPosition;
            s = s.substr(0, tempPosition + 1U);
            if(s.size() == 1U) {
                break;
            }
            while((s.size() > 1U) && (tempPosition < s.size()) && (s.at(tempPosition) == '1')) {
                s[tempPosition] = '0';
                --tempPosition;
            }
            if((tempPosition + 1U) == 0U) {
                s = '1' + s;
            } else {
                s[tempPosition] = '1';
            }
            ++result;
        }

        return result;
    }
};

int main() {
    cout << "1101: " << Solution::numSteps("1101") << std::endl;
    cout << "10: " << Solution::numSteps("10") << std::endl;
    cout << "1: " << Solution::numSteps("1") << std::endl;

    return 0;
}
