using RemoveNthNodeFromEndOfList;

namespace RemoveNthNodeFromEndOfListTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();

            // Example 1
            ListNode head = new(1, new(2, new(3, new(4, new(5)))));
            ListNode res = new(1, new(2, new(3, new(5))));
            ListNode output = solution.RemoveNthFromEnd(head, 2);
            while(res != null) { 
                Assert.AreEqual(res.val, output.val);
                res = res.next;
                output = output.next;
            }

            // Example 2
            head = new(1);
            res = null;
            output = solution.RemoveNthFromEnd(head, 2);
            Assert.AreEqual(res, output);

            // Example 3
            head = new(1, new(2));
            res = new(1);
            output = solution.RemoveNthFromEnd(head, 1);
            while (res != null)
            {
                Assert.AreEqual(res.val, output.val);
                res = res.next;
                output = output.next;
            }

            // Example 3
            head = new(1, new(2));
            res = new(2);
            output = solution.RemoveNthFromEnd(head, 2);
            while (res != null)
            {
                Assert.AreEqual(res.val, output.val);
                res = res.next;
                output = output.next;
            }
        }
    }
}