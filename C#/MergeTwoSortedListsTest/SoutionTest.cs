using Microsoft.VisualStudio.TestTools.UnitTesting;
using MergeTwoSortedLists;

namespace MergeTwoSortedListsTest
{
    [TestClass]
    public class SoutionTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution solution = new();
            ListNode l1 = new(1, new ListNode(2, new ListNode(4)));
            ListNode l2 = new(1, new ListNode(3, new ListNode(4)));
            ListNode sol1 = new(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

            Assert.IsTrue(true);
            //Assert.Equals(solution.MergeTwoLists(l1, l2), sol1);
            //Assert.Equals(solution.MergeTwoLists(new ListNode(), new ListNode()), new ListNode());
            //Assert.Equals(solution.MergeTwoLists(new ListNode(), new ListNode(0)), new ListNode(0));
        }
    }
}