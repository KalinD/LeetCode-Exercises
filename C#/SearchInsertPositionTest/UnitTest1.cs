using SearchInsertPosition;

namespace SearchInsertPositionTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();
            int[] nums = new int[] { 1, 3, 5, 6 };
            Assert.AreEqual(2, solution.SearchInsert(nums, 5));
            Assert.AreEqual(1, solution.SearchInsert(nums, 2));
            Assert.AreEqual(4, solution.SearchInsert(nums, 7));
        }
    }
}