using MergeKSortedLists;

namespace MergeKSortedListsTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();

            // Example 1
            ListNode[] lists = new ListNode[]{
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6)),
            };
            ListNode res = new(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6))))))));
            ListNode output = solution.MergeKLists(lists);
            while(res.next != null) { 
                Assert.AreEqual(res.val, output.val);
                res = res.next;
                output = output.next;
            }
            
            // Example 2
            lists = new ListNode[0];
            output = solution.MergeKLists(lists); // []

            // Example 3
            lists = new ListNode[] { null };
            output = solution.MergeKLists(lists); // []
        }
    }
}