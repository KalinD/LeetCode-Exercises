namespace SwapNodesInPairs;

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
    public ListNode SwapPairs(ListNode head)
    {
        ListNode current = head;
        ListNode prevNode = head;
        while(current != null && current.next != null) { 
            ListNode nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = current;
            if(current == head) { 
                head = nextNode;
            } else { 
                prevNode.next = nextNode;
            }
            prevNode = current;
            current = current.next;
        }

        return head;
    }

    public static void Main(string[] args) { }
}