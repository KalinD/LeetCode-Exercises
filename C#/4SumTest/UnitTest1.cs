using _4Sum;

namespace _4SumTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();

            // Example 1
            int[] nums = new int[] { 1, 0, -1, 0, -2, 2 };
            List<IList<int>> sol = new() {
                new List<int>() { -2, -1, 1, 2 },
                new List<int> { -2, 0, 0, 2 },
                new List<int>() { -1, 0, 0, 1 }
            };
            IList<IList<int>> res = solution.FourSum(nums, 0);
            Assert.AreEqual(sol.Count, res.Count);
            for(int i = 0; i < 3; i++) { 
                for(int j = 0; j < 4; j++) {
                    Assert.AreEqual(sol[i][j], res[i][j]);
                }
            }

            // Example 2
            nums = new int[] { 2, 2, 2, 2, 2 };
            sol = new() {
                new List<int>() { 2,2,2,2 }
            };
            res = solution.FourSum(nums, 8);
            Assert.AreEqual(sol.Count, res.Count);
            for (int i = 0; i < 1; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    Assert.AreEqual(sol[i][j], res[i][j]);
                }
            }

            // Example 3
            nums = new int[] { 0, 0, 0, 0 };
            sol = new() {
                new List<int>() { 0, 0, 0, 0 }
            };
            res = solution.FourSum(nums, 0);
            Assert.AreEqual(sol.Count, res.Count);
            for (int i = 0; i < 1; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    Assert.AreEqual(sol[i][j], res[i][j]);
                }
            }

            // Example 4
            nums = new int[] { 1000000000, 1000000000, 1000000000, 1000000000 };
            sol = new() {};
            res = solution.FourSum(nums, -294967296);
            Assert.AreEqual(sol.Count, res.Count);
        }
    }
}