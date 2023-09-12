using ReverseNodesInKGroup;

namespace ReverseNodesInKGroupTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();

            // Examples 1
            ListNode head = new(1, new(2, new(3, new(4, new(5)))));
            ListNode res =  new(2, new(1, new(4, new(3, new(5)))));
            ListNode output = solution.ReverseKGroup(head, 2);
            while(res != null) { 
                Assert.AreEqual(res.val, output.val);
                res = res.next;
                output = output.next;
            }

            // Examples 2
            head = new(1, new(2, new(3, new(4, new(5)))));
            res = new(3, new(2, new(1, new(4, new(5)))));
            output = solution.ReverseKGroup(head, 3);
            while (res != null)
            {
                Assert.AreEqual(res.val, output.val);
                res = res.next;
                output = output.next;
            }

            // Examples 3
            head = new(1, new(2));
            res = new(2, new(1));
            output = solution.ReverseKGroup(head, 2);
            while (res != null)
            {
                Assert.AreEqual(res.val, output.val);
                res = res.next;
                output = output.next;
            }
        }
    }
}