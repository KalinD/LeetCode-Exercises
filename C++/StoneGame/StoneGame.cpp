#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
    int getOptimal(vector<int>& piles, int& startIndex, int& endIndex) {
        if ((startIndex + 1 < endIndex) && (piles.at(startIndex + 1) < piles.at(endIndex - 1))) {
            ++startIndex;
            return piles.at(startIndex - 1);
        } else if ((startIndex + 1 < endIndex) && (piles.at(startIndex + 1) >= piles.at(endIndex - 1))) {
            --endIndex;
            return piles.at(endIndex + 1);
        } else {
            return piles.at(startIndex++);
        }
    }

    bool stoneGame(vector<int>& piles) {
        unsigned char turn = 0;
        int startIndex = 0;
        int endIndex = piles.size() - 1;
        int alicePoints = 0;
        int bobPoints = 0;

        while (startIndex < endIndex) {
            if (turn % 2 == 0) { // Alice
                alicePoints += getOptimal(piles, startIndex, endIndex);
            } else { // Bob
                bobPoints += getOptimal(piles, startIndex, endIndex);
            }
        }

        return (alicePoints > bobPoints);
    }
};

int main() {
    Solution sol;
    vector<int> piles1 = {5, 3, 4, 5};
    cout << "Example 1 should be true: " << (sol.stoneGame(piles1) ? "true" : "false") << endl;
    vector<int> piles2 = {3, 7, 2, 3};
    cout << "Example 2 should be true: " << (sol.stoneGame(piles2) ? "true" : "false") << endl;
    return 0;
}
