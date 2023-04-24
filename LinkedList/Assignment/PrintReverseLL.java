package LinkedList.Assignment;

public class PrintReverseLL {
  public static void main(String[] args) {
    ListNode node  = new ListNode(4);
    ListNode t = node;
    t.next = new ListNode(3);
    t  = t.next;
    t.next = new ListNode(2);
    t = t.next;
    t.next = new ListNode(1);

    reverseLL(node);
    System.out.println();
  }

  public static void reverseLL(ListNode head) {
    if(head == null)return;

    reverseLL(head.next);
    System.out.print(head.data+" ");
  }
}

class ListNode {
  int data;
  ListNode next;

  ListNode(int x) {
      this.data = x;
  }
}