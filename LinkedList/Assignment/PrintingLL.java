package LinkedList.Assignment;



public class PrintingLL {
  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    ListNode t = node;
    t.next = new ListNode(2);
    t  = t.next;
    t.next = new ListNode(3);

    ListNode temp = node;

    while(temp != null)
    {
      System.out.print(temp.data+" " );
      temp = temp.next;
    }
    System.out.println();

  }
}

 class ListNode {
  int data;
  ListNode next;

  ListNode(int x) {
      this.data = x;
  }
}
