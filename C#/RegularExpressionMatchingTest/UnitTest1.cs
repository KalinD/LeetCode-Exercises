using RegularExpressionMatching;

namespace RegularExpressionMatchingTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();
            
            // Example 1
            String s = "aa", p = "a";
            Assert.IsFalse(solution.IsMatch(s, p));

            // Example 2
            s = "aa";
            p = "a*";
            Assert.IsTrue(solution.IsMatch(s, p));

            // Example 3
            s = "ab";
            p = ".*";
            Assert.IsTrue(solution.IsMatch(s, p));

            // Example 4
            s = "aab";
            p = "c*a*b";
            Assert.IsTrue(solution.IsMatch(s, p));

            // Example 5
            s = "ab";
            p = ".*c";
            Assert.IsFalse(solution.IsMatch(s, p));

            // Example 6
            s = "aaa";
            p = "a*a";
            Assert.IsTrue(solution.IsMatch(s, p));

            // Example 6
            s = "aaa";
            p = "aaaa";
            Assert.IsFalse(solution.IsMatch(s, p));


            // Example 6
            s = "aaa";
            p = "ab*a*c*a";
            Assert.IsTrue(solution.IsMatch(s, p));
        }
    }
}