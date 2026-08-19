#include <vector>
#include <iostream>
#include <unordered_map>
#include <unordered_set>

using namespace std;

class Solution {
public:
    int maxNumberOfFamilies(int n, vector<vector<int>>& reservedSeats) {
        int reservedSeatsPosition = 0;
        int res = 0;
        int emptyRows = n;
        unordered_map<int, unsigned char> takenSeatsPerRow;


        for (vector<int> reservedSeat : reservedSeats) {
            if (10 == reservedSeat.at(1)) continue;
            if (takenSeatsPerRow.end() == takenSeatsPerRow.find(reservedSeat.at(0))) {
                takenSeatsPerRow[reservedSeat.at(0)] = (1U << (9 - reservedSeat.at(1)));
                --emptyRows;
            } else {
                takenSeatsPerRow[reservedSeat.at(0)] |= (1U << (9 - reservedSeat.at(1)));
            }
        }

        for (auto pair : takenSeatsPerRow) {
            bool canAddMiddle = true;
            if ((pair.second & 0b11110000) == 0U) {
                ++res;
                canAddMiddle = false;
            }
            if ((pair.second & 0b00001111) == 0U) {
                ++res;
                canAddMiddle = false;
            }
            if ((false != canAddMiddle) && (pair.second & 0b00111100) == 0U) {
                ++res;
            }
        }
        res += emptyRows * 2;
        return res;
    }
};


int main() {
    Solution sol;

    vector<vector<int>> ex1 = {{1,2},{1,3},{1,8},{2,6},{3,1},{3,10}};
    cout << "Example 1 should be 4: " << sol.maxNumberOfFamilies(3, ex1) << endl;

    vector<vector<int>> ex2 = {{2, 1}, {1, 8}, {2, 6}};
    cout << "Example 2 should be 2: " << sol.maxNumberOfFamilies(2, ex2) << endl;

    vector<vector<int>> ex3 = {{4,3},{1,4},{4,6},{1,7}};
    cout << "Example 3 should be 4: " << sol.maxNumberOfFamilies(4, ex3) << endl;
}
