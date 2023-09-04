using PlusOne;

namespace PlusOneTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();
            // Example 1
            int[] digits = new int[] { 1, 2, 3 };
            int[] res = new int[] { 1, 2, 4 };
            int[] output = solution.PlusOne(digits);
            Assert.AreEqual(res.Length, output.Length);
            for (int i = 0; i < res.Length; i++) {
                Assert.AreEqual(res[i], output[i]);
            }

            // Example 2
            digits = new int[] { 4, 3, 2, 1 };
            res = new int[] { 4, 3, 2, 2 };
            output = solution.PlusOne(digits);
            Assert.AreEqual(res.Length, output.Length);
            for (int i = 0; i < res.Length; i++)
            {
                Assert.AreEqual(res[i], output[i]);
            }

            // Example 3
            digits = new int[] { 9 };
            res = new int[] { 1, 0 };
            output = solution.PlusOne(digits);
            Assert.AreEqual(res.Length, output.Length);
            for (int i = 0; i < res.Length; i++)
            {
                Assert.AreEqual(res[i], output[i]);
            }

            // Example 4
            digits = new int[] { 9, 9 };
            res = new int[] { 1, 0, 0 };
            output = solution.PlusOne(digits);
            Assert.AreEqual(res.Length, output.Length);
            for (int i = 0; i < res.Length; i++)
            {
                Assert.AreEqual(res[i], output[i]);
            }

            // Example 5
            digits = new int[] { 8, 9, 9, 9 };
            res = new int[] { 9, 0, 0, 0 };
            output = solution.PlusOne(digits);
            Assert.AreEqual(res.Length, output.Length);
            for (int i = 0; i < res.Length; i++)
            {
                Assert.AreEqual(res[i], output[i]);
            }
        }
    }
}