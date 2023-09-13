using SubstringWithConcatenationOfAllWords;

namespace SubstringWithConcatenationOfAllWordsTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();

            // Example 1
            String s = "barfoothefoobarman";
            String[] words = new String[]{"foo", "bar" };
            List<int> sol = new List<int>() { 0, 9 };
            IList<int> output = solution.FindSubstring(s, words);
            Assert.AreEqual(sol.Count, output.Count);
            for(int i = 0; i < sol.Count; i++) {
                Assert.IsTrue(output.Contains(sol[i]));
            }

            // Example 2
            s = "wordgoodgoodgoodbestword";
            words = new String[] { "word", "good", "best", "word" };
            output = solution.FindSubstring(s, words);
            Assert.AreEqual(0, output.Count);


            // Example 3
            s = "barfoofoobarthefoobarman";
            words = new String[] { "bar", "foo", "the" };
            sol = new List<int>() { 6, 9, 12 };
            output = solution.FindSubstring(s, words);
            Assert.AreEqual(sol.Count, output.Count);
            for (int i = 0; i < sol.Count; i++)
            {
                Assert.IsTrue(output.Contains(sol[i]));
            }
        }
    }
}