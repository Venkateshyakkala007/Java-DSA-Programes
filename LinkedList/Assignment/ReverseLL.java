package LinkedList.Assignment;

public class ReverseLL {
  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    ListNode t = node;
    t.next = new ListNode(2);
    t = t.next;
    t.next = new ListNode(3);
    t = t.next;
    t.next = new ListNode(4);

    ListNode ans = ReverseLinkedList(node);

    while(ans != null)
    {
      System.out.print(ans.data+" ");
      ans = ans.next;
    }
  }

  public static ListNode ReverseLinkedList(ListNode head)
  {
    ListNode prev = null;
    ListNode curr = head;
    ListNode next = null;

    while(curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
    return head;
  }
}


class ListNode {
  int data;
  ListNode next;

  ListNode(int x) {
      this.data = x;
  }
}
