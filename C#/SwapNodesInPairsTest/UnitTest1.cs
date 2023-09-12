using SwapNodesInPairs;

namespace SwapNodesInPairsTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();

            // Example 1
            ListNode head = new(1, new(2, new(3, new(4))));
            ListNode sol = new(2, new(1, new(4, new(3))));
            ListNode output = solution.SwapPairs(head);
            while(sol != null) { 
                Assert.AreEqual(sol.val, output.val);
                sol = sol.next;
                output = output.next;
            }

            // Example 2
            head = new();
            output = solution.SwapPairs(head);
            Assert.AreEqual(head, output);

            // Example 3
            head = new(1);
            output = solution.SwapPairs(head);
            Assert.AreEqual(1, output.val);
        }
    }
}