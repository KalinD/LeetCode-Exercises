namespace MergeTwoSortedLists
{

    //Definition for singly-linked list.
    public class ListNode
    {
        public int val;
        public ListNode next;
        public ListNode(int val = 0, ListNode next = null)
        {
            this.val = val;
            this.next = next;
        }

        public override string ToString()
        {
            if (next == null) { 
                return val.ToString();
            }
            return $"{val}, {next}";
        }
    }

    public class Solution
    {
        public ListNode MergeTwoLists(ListNode list1, ListNode list2)
        {
            if (list1 == null) { 
                return list2;
            }
            if (list2 == null) {
                return list1;
            }

            if (list1.val < list2.val) {
                return new ListNode(list1.val, MergeTwoLists(list1.next, list2));
            } else {
                return new ListNode(list2.val, MergeTwoLists(list1, list2.next));
            }
        }
        public static void Main(String[] args)
        {
            Solution solution = new();
            ListNode l1 = new(1, new ListNode(2, new ListNode(4)));
            ListNode l2 = new(1, new ListNode(3, new ListNode(4)));
            ListNode sol1 = new(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
            Console.WriteLine(l1);
            Console.WriteLine(solution.MergeTwoLists(l1, l2));
        }
    }
}
