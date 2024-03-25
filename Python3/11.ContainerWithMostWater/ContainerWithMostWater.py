from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        i = 0
        j = len(height) - 1
        m = 0
        while i < j:
            h = min(height[i], height[j])
            m = max(m, (j - i) * h)
            while i < j and height[i] <= h:
                i += 1
            while i < j and height[j] <= h:
                j -= 1
        return m