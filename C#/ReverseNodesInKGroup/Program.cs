namespace ReverseNodesInKGroup;

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
    public ListNode ReverseKGroup(ListNode head, int k)
    {
        if (k == 1)
        {
            return head;
        }
        List<ListNode> sublist = new List<ListNode>();
        ListNode current = head;
        ListNode beforeSublist = head;
        while (current != null)
        {
            sublist.Add(current);
            current = current.next;
            if (sublist.Count == k)
            {
                for (int i = k - 1; i > 0; i--)
                {
                    sublist[i].next = sublist[i - 1];
                }
                if (beforeSublist == head)
                {
                    head = sublist[k - 1];
                }
                else
                {
                    beforeSublist.next = sublist[k - 1];
                }
                sublist[0].next = null;
                beforeSublist = sublist[0];
                sublist.Clear();
            }
        }

        if (sublist.Count > 0)
        {
            beforeSublist.next = sublist[0];
        }

        return head;
    }

    public static void Main(string[] args) { }
}