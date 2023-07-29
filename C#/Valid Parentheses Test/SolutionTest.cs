using Microsoft.VisualStudio.TestTools.UnitTesting;
using ValidPantheses;

namespace Valid_Parentheses_Test
{
    [TestClass]
    public class SolutionTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();
            Assert.IsTrue(solution.IsValid("()"));
            Assert.IsTrue(solution.IsValid("()[]{}"));
            Assert.IsFalse(solution.IsValid("([)]"));
            Assert.IsFalse(solution.IsValid("){"));
        }
    }
}