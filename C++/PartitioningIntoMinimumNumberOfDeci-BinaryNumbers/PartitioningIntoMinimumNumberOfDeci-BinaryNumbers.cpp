#include <string>
#include <iostream>

using namespace std;

class Solution {
public:
    static int minPartitions(string n) {
        unsigned char max = 0U;

        for (char& c : n) {
            if (c - '0' > max) {
                max = c - '0';
            }
            if (max == 9U) {
                break;
            }
        }

        return max;
    }
};


int main() {
    cout << "32: " << Solution::minPartitions("32") << endl;
    cout << "82734: " << Solution::minPartitions("82734") << endl;
    cout << "27346209830709182346: " << Solution::minPartitions("27346209830709182346") << endl;

    return 0;
}
