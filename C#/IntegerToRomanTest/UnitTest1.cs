using IntegerToRoman;

namespace IntegerToRomanTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();

            Assert.AreEqual("III", solution.IntToRoman(3));
            Assert.AreEqual("LVIII", solution.IntToRoman(58));
            Assert.AreEqual("MCMXCIV", solution.IntToRoman(1994));
        }
    }
}