using Microsoft.VisualStudio.TestTools.UnitTesting;
using RemoveDuplicateFromSortedArray;

namespace RemoveDuplicatesFromSortedArrayTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new();
            int[] nums = new int[] { 1, 1, 2 };
            int[] expectedNums = new int[] { 1, 2 };
            int k = s.RemoveDuplicates(nums);
            Console.WriteLine("Test: ");
            foreach (int n in nums)
            {
                Console.Write(n + ", ");
            }
            Console.WriteLine();
            Assert.AreEqual(expectedNums.Length, k);
            for(int i = 0; i < k; i++) {
                Assert.AreEqual(nums[i], expectedNums[i]);
            }
        }
    }
}