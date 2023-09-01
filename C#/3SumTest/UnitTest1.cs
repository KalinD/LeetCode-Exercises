using _3Sum;

namespace _3SumTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution soltuion = new();
            int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
            List<List<int>> sol = new() { new List<int>() { -1, -1, 2 }, new List<int>() { -1, 0, 1 } };
            IList<IList<int>> returned = soltuion.ThreeSum(nums);
            for (int i = 0; i < sol.Count; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Assert.AreEqual(sol[i][j], returned[i][j]);
                }
            }


            nums = new int[] { 0, 1, 1 };
            Assert.IsTrue(!soltuion.ThreeSum(nums).Any());

            nums = new int[] { 0, 0, 0 };
            sol = new List<List<int>>() { new List<int>() { 0, 0, 0 } };

            returned = soltuion.ThreeSum(nums);
            for (int i = 0; i < sol.Count; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Assert.AreEqual(sol[i][j], returned[i][j]);
                }
            }
        }
    }
}