using GenerateParentheses;
using System.Collections;

namespace GenerateParenthesesTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();

            // Example 1:
            IList<string> res = new List<string>() { "((()))", "(()())", "(())()", "()(())", "()()()" };
            IList<string> output = solution.GenerateParenthesis(3);
            Assert.AreEqual(res.Count, output.Count);
            for(int i = 0; i < res.Count; i++) {
                Assert.IsTrue(output.Contains(res[i]));
            }


            // Example 2:
            output = solution.GenerateParenthesis(1);
            res = new List<string>() { "()" };
            Assert.AreEqual(res.Count, output.Count);
            Assert.AreEqual(res[0], output[0]);

            // Example 1:
            res = new List<string>() {
                "(((())))", "((()()))", "((())())", "((()))()",
                "(()(()))", "(()()())", "(()())()", "(())(())",
                "(())()()", "()((()))", "()(()())", "()(())()",
                "()()(())", "()()()()"
            };
            output = solution.GenerateParenthesis(4);
            Assert.AreEqual(res.Count, output.Count);
            for (int i = 0; i < res.Count; i++)
            {
                Assert.IsTrue(output.Contains(res[i]));
            }
        }
    }
}