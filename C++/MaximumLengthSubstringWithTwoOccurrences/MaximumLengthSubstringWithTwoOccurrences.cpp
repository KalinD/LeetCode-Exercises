#include <string>
#include <iostream>
#include <unordered_map>
#include <cassert>

using namespace std;

class Solution {
public:
    int maximumLengthSubstring(string s) {
        int max_value = 0;
        int left = 0;
        int right = left + 1;
        unordered_map<char, int> window_values_count;
        window_values_count[s.at(left)] = 1;
        while (left < s.size()) {
            if (max_value >= (s.size() - left)) {
                break;
            }
            while(right < s.size()) {
                if (window_values_count.end() != window_values_count.find(s.at(right))) {
                    if (2 == window_values_count[s.at(right)]) {
                        max_value = (max_value > (right - left)) ? (max_value) : (right - left);
                        break;
                    }
                    ++window_values_count[s.at(right)];
                } else  {
                    window_values_count[s.at(right)] = 1;
                }
                ++right;
            }
            max_value = (max_value > (right - left)) ? (max_value) : (right - left);

            --window_values_count[s.at(left)];
            ++left;
        }

        return max_value;
    }
};

int main() {
    Solution sol;
    assert(4 == sol.maximumLengthSubstring("bcbbbcba"));
    cout << "Example 1 is correct\n";
    
    assert(2 == sol.maximumLengthSubstring("aaaa"));
    cout << "Example 2 is correct\n";

    return 0;
}
