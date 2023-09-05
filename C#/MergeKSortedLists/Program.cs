namespace MergeKSortedLists;

public class ListNode
{
    public int val;
    public ListNode next;
    public ListNode(int val = 0, ListNode next = null)
    {
        this.val = val;
        this.next = next;
    }
}

public class Solution
{
    public ListNode MergeKLists(ListNode[] lists)
    {
        ListNode head = null;
        ListNode current = null;
        bool isSet = false;
        int smallest = 0;
        bool isAtLeastOneNotNull = true;
        while (isAtLeastOneNotNull)
        {
            isAtLeastOneNotNull = false;
            isSet = false;
            for (int i = 0; i < lists.Length; i++)
            {
                if (lists[i] != null)
                {
                    isAtLeastOneNotNull = true;
                    if (!isSet || lists[i].val < smallest)
                    {
                        isSet = true;
                        smallest = lists[i].val;
                    }
                }
            }
            for (int i = 0; i < lists.Length; i++)
            {
                if (lists[i] != null && lists[i].val == smallest)
                {
                    if (head == null) { 
                        head = new(smallest);
                        current = head;
                        head.next = current;
                        current.next = null;
                    } else { 
                        current.next = new ListNode(smallest);
                        current = current.next;
                        current.next = null;
                    }
                    lists[i] = lists[i].next;
                    break;
                }
            }
        }


        return head;
    }

    public static void Main(string[] args) { }
}