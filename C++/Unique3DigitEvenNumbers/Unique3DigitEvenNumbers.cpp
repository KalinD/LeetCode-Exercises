#include <vector>
#include <iostream>
#include <unordered_map>

using namespace std;

class Solution {
public:
    int totalNumbers(vector<int>& digits) {
        unsigned char evenCount = 0;
        unsigned char oddCount = 0;
        unordered_map<int, unsigned char> evens;
        unordered_map<int, unsigned char> odds;
        
        for (int digit : digits) {
            if (digit % 2 == 0) {
                ++evenCount;
                if (evens.end() == evens.find(digit)) {
                    evens[digit] = 1U;
                } else {
                    ++evens[digit];
                }
            } else {
                ++oddCount;
                if (odds.end() == odds.find(digit)) {
                    odds[digit] = 1U;
                } else {
                    ++odds[digit];
                }
            }
        }
        
        if (0 == evenCount) return 0;
        if ((1 == evens.size()) && (0 == odds.size()) && (0 != digits.at(0))) return 1;

        return helper1(evens, odds);
    }

    int helper1(unordered_map<int, unsigned char> evens, unordered_map<int, unsigned char> odds) {
        int res = 0;
        for (auto pair : odds) {
            --odds[pair.first];
            res += helper2(evens, odds);
            ++odds[pair.first];
        }
        for (auto pair : evens) {
            if(0 != pair.first) {
                --evens[pair.first];
                res += helper2(evens, odds);
                ++evens[pair.first];
            }
        }
        return res;
    }

    int helper2(unordered_map<int, unsigned char> evens, unordered_map<int, unsigned char> odds) {
        int res = 0;
        for (auto pair : odds) {
            if (pair.second > 0) {
                --odds[pair.first];
                res += helper3(evens, odds);
                ++odds[pair.first];
            }
        }
        for (auto pair : evens) {
            if (pair.second > 0) {
                --evens[pair.first];
                res += helper3(evens, odds);
                ++evens[pair.first];
            }
        }
        return res;
    }

    int helper3(unordered_map<int, unsigned char> evens, unordered_map<int, unsigned char> odds) {
        int res = 0;
        for (auto pair : evens) {
            if (pair.second > 0) {
                ++res;
            }
        }
        return res;
    }

    // Old solution with incorrect assumptions
    int totalNumbers1(vector<int>& digits) {
        unsigned char evenCount = 0;
        unsigned char oddCount = 0;
        bool hasZero = false;
        unordered_map<int, unsigned char> evens;
        unordered_map<int, unsigned char> odds;
        
        for (int digit : digits) {
            if (0 == digit) {
                hasZero = true;
            }
            if (digit % 2 == 0) {
                ++evenCount;
                if (evens.end() != evens.find(digit)) {
                    evens[digit] = 1U;
                } else {
                    ++evens[digit];
                }
            } else {
                ++oddCount;
                if (odds.end() != odds.find(digit)) {
                    odds[digit] = 1U;
                } else {
                    ++odds[digit];
                }
            }
        }

        if (0 == evenCount) return 0;
        if ((1 == evens.size()) && (0 == odds.size())) return 1;

        return (oddCount + evenCount + ((hasZero) ? (2) : (1))) * (oddCount + evenCount - 2) * (evenCount);
    }
};

int main() {
    Solution sol;
    vector<int> ex1 = {1,2,3,4};
    cout << "Example 1 should be 12: " << sol.totalNumbers(ex1) << endl;

    vector<int> ex2 = {0,2,2};
    cout << "Example 2 should be 2: " << sol.totalNumbers(ex2) << endl;

    vector<int> ex3 = {6,6,6};
    cout << "Example 3 should be 1: " << sol.totalNumbers(ex3) << endl;

    vector<int> ex4 = {1,3,5};
    cout << "Example 4 should be 0: " << sol.totalNumbers(ex4) << endl;

    vector<int> ex5 = {0,2,2,4,4};
    cout << "Example 5 should be 14: " << sol.totalNumbers(ex5) << endl;

    vector<int> ex6 = {0,0,0};
    cout << "Example 6 should be 0: " << sol.totalNumbers(ex6) << endl;

    return 0;
}
