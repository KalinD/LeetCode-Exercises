using Sqrt;

namespace SqrtTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();

            // Example 1
            Assert.AreEqual(2, solution.MySqrt(4));

            // Example 2
            Assert.AreEqual(2, solution.MySqrt(8));

            // Example 3
            Assert.AreEqual(1, solution.MySqrt(1));

            // Example 4
            Assert.AreEqual(0, solution.MySqrt(0));

            // Example 5
            Assert.AreEqual(46340, solution.MySqrt(2147395600));
        }
    }
}