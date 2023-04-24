package LinkedList.Assignment;




public class InsertLL {
  public static void main(String[] args) {
    ListNode node = new ListNode(1);
        ListNode temp = node;
        temp.next = new ListNode(2);

        int element = 3;
        int position = 1;

        // insert(node,element,position);

        ListNode dat = insert(node,element,position);
        System.out.println(dat);

        while(dat != null) {
            System.out.print(dat.data+" ");
            dat = dat.next;
        }
  }

  public static ListNode insert(ListNode A,int B,int C)
    {
        ListNode xn = new ListNode(B);
        if(C == 0 || A == null) {
            xn.next = A;
            // xn = A;
            return xn;
        }

        ListNode temp = A;

        for(int  i = 1; i < C; i++) {
            if(temp.next == null) {
                temp.next = xn;
                return A;
            }
            temp = temp.next;
        }

        xn.next = temp.next;
        temp.next = xn;
        return A;
    }
}

class ListNode {
  int data;
  ListNode next;

  ListNode(int x) {
      this.data = x;
  }
}