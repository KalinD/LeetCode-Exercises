using AddBinary;

namespace AddBinaryTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();

            // Example 1
            string a = "11", b = "1";
            Assert.AreEqual("100", solution.AddBinary(a, b));

            //Example 2
            a = "1010";
            b = "1011";
            Assert.AreEqual("10101", solution.AddBinary(a, b));

            // Example 3
            a = "110010";
            b =  "10111";
            Assert.AreEqual("1001001", solution.AddBinary(a, b));
        }
    }
}