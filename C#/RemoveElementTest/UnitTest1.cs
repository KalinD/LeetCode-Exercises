using RemoveElement;

namespace RemoveElementTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();
            int[] nums = new int[] { 3, 2, 2, 3 };
            int[] expected = new int[] { 2, 2 };

            Assert.AreEqual(2, solution.RemoveElement(nums, 3));
            for (int i = 0; i < expected.Length; i++)
            {
                Assert.AreEqual(expected[i], nums[i]);
            }

            nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
            expected = new int[] { 0, 1, 4, 0, 3 };

            Assert.AreEqual(5, solution.RemoveElement(nums, 2));
            for (int i = 0; i < expected.Length; i++)
            {
                Assert.AreEqual(expected[i], nums[i]);
            }

            nums = new int[] { 3, 3 };
            expected = new int[] { };

            Assert.AreEqual(0, solution.RemoveElement(nums, 3));
            for (int i = 0; i < expected.Length; i++)
            {
                Assert.AreEqual(expected[i], nums[i]);
            }
        }
    }
}