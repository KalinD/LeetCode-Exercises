using FindTheIndexOfTheFirstOccurrenceInAString;

namespace FindTheIndexOfTheFirstOccurrenceInAStringTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();
            String haystack = "sadbutsad", needle = "sad";
            Assert.AreEqual(0, solution.StrStr(haystack, needle));
            haystack = "leetcode";
            needle = "leeto";
            Assert.AreEqual(-1, solution.StrStr(haystack, needle));
            haystack = "a";
            needle = "a";
            Assert.AreEqual(0, solution.StrStr(haystack, needle));
        }
    }
}