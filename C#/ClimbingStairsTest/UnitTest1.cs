using ClimbingStairs;

namespace ClimbingStairsTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();

            // Example 1
            Assert.AreEqual(2, solution.ClimbStairs(2));

            // Example 2
            Assert.AreEqual(3, solution.ClimbStairs(3));
        }
    }
}