class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        res = []
        for digit in digits:
            possibilities = []
            if digit == '2':
                possibilities = ["a", "b", "c"]
            if digit == '3':
                possibilities = ["d", "e", "f"]
            if digit == '4':
                possibilities = ["g", "h", "i"]
            if digit == '5':
                possibilities = ["j", "k", "l"]
            if digit == '6':
                possibilities = ["m", "n", "o"]
            if digit == '7':
                possibilities = ["p", "q", "r", "s", ]
            if digit == '8':
                possibilities = ["t", "u", "v"]
            if digit == '9':
                possibilities = ["w", "x", "y", "z"]
            temp = res
            res = []
            for i in range(len(temp)):
                for p in possibilities:
                    res.append(temp[i] + p)
            if len(res) == 0:
                res = possibilities
        return res

# Example 1:
# Input: digits = "23"
# Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

# Example 2:
# Input: digits = ""
# Output: []

# Example 3:
# Input: digits = "2"
# Output: ["a","b","c"]