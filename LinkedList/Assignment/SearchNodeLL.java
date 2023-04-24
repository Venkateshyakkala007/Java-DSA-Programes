package LinkedList.Assignment;

public class SearchNodeLL {
  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    ListNode t = node;
    t.next = new ListNode(2);
    t = t.next;
    t.next = new ListNode(3);
  
    boolean bool = searchNode(node, 4);

    if(bool) System.out.println("Element is found");
    else System.out.println("element is not found");


  }

  // Time complexity -- O(N) sc : O(1)
  public static boolean searchNode(ListNode head, int B) {
    if(head == null) return false;

    ListNode temp = head;

    while(temp != null)
    {
      if(temp.data == B) return true;
      temp = temp.next;
    }
    return false;
  }
}



class ListNode {
  int data;
  ListNode next;

  ListNode(int x) {
      this.data = x;
  }
}
