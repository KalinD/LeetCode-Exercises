import unittest

from ContainerWithMostWater import Solution


class MyTestCase(unittest.TestCase):
    def test_example1(self):
        sol = Solution()
        self.assertEqual(49, sol.maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]))  # add assertion here

    def test_example2(self):
        sol = Solution()
        self.assertEqual(1, sol.maxArea([1, 1]))  # add assertion here


if __name__ == '__main__':
    unittest.main()
