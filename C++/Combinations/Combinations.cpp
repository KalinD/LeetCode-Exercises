#include <vector>
#include <iostream>

using namespace std;

static void print_array(const vector<vector<int>>& array) {
    cout << "[";
    for (const vector<int>& entry : array) {
        cout << "[";
        for (int i = 0; i < entry.size() - 1; ++i) {
            cout << entry.at(i) << ",";
        }
        if (entry != array.at(array.size() - 1)) {
            cout << entry.at(entry.size() - 1) << "],";
        } else {
            cout << entry.at(entry.size() - 1) << "]";
        }
    }
    cout << "]" << endl;
}

class Solution {
public:
    vector<vector<int>> combine(int n, int k) {
        vector<vector<int>> result;

        if (1 == k) {
            for (int i = 1; i <= n; ++i) {
                vector<int> c = {i};
                result.push_back(c);
            }
            return result;
        }

        for(int i = 1; i <= n; ++i) {
            vector<vector<int>> temp = get_combination(i, n, k);
            result.insert(result.end(), temp.begin(), temp.end());
        }

        return result;
    }
private:
    vector<vector<int>> get_combination(int current_i, int n, int k) {
        vector<vector<int>> res;

        if (0 == k) {
            return res;
        } else if (1 == k) {
            vector<int> temp = {current_i};
            res.push_back(temp);
            return res;
        }

        for (int i = current_i + 1; i <= n; ++i) {
            vector<vector<int>> sub_combinations = get_combination(i, n, k - 1);

            for(vector<int>& combination : sub_combinations) {
                if (false != combination.empty()) continue;
                combination.insert(combination.begin(), current_i);
                res.push_back(combination);
            }
        }
        return res;
    }
};


int main() {
    Solution sol;
    vector<vector<int>> result1 = sol.combine(4, 2);
    cout << "Res 1 should be: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]] - ";
    print_array(result1);
    vector<vector<int>> result2 = sol.combine(1, 1);
    cout << "Res 2 should be: [[1]] - ";
    print_array(result2);
    vector<vector<int>> result3 = sol.combine(2, 1);
    cout << "Res 3 should be: [[1],[2]] - ";
    print_array(result3);
    vector<vector<int>> result4 = sol.combine(3, 3);
    cout << "Res 4 should be: [[1,2,3]] - ";
    print_array(result4);
    vector<vector<int>> result5 = sol.combine(4, 3);
    cout << "Res 5 should be: [[1,2,3],[1,2,4],[1,3,4],[2,3,4]] - ";
    print_array(result5);
}
