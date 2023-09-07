namespace RemoveNthNodeFromEndOfList;

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
    public ListNode RemoveNthFromEnd(ListNode head, int n)
    {
        if (head.next == null)
        {
            return null;
        }
        ListNode nBack = head;
        ListNode current = head;
        int i = 0;
        while (current != null)
        {
            if (i > n)
            {
                nBack = nBack.next;
            }
            current = current.next;
            i++;
        }
        if (nBack == head && i == n)
        {
            head = head.next;
        }
        else
        {
            nBack.next = nBack.next.next;
        }
        return head;
    }

    public static void Main(string[] args) { }
}