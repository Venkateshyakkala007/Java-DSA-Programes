package LinkedList2;

public class mergeLL {
  public static void main(String[] args)
  {

      // test case
      //  A = 5 -> 8 -> 20
      // B = 4 -> 11 -> 15
      //first node
      Node h1 = new Node(5);
      Node t1 = h1;
      t1.next = new Node(8);
      t1 = t1.next;
      t1.next = new Node(20);
      // t1 = t1.next;
      // t1.next = new Node(14);
      // t1 = t1.next;
      // t1.next = new Node(19);

      // second node
       Node h2 = new Node(4);
      Node t2 = h2;
      t2.next = new Node(11);
      t2 = t2.next;
      t2.next = new Node(15);
      // t2 = t2.next;
      // t2.next = new Node(14);
      // t2 = t2.next;
      // t2.next = new Node(19);

      Node ans = merge(h1,h2);
      System.out.println(ans);

      while(ans != null)
      {
          System.out.print(ans.data+" ");
          ans = ans.next;
      }
      
  }


  public static Node merge(Node h1, Node h2)
  {
      Node h, t;

      if(h1.data < h2.data) {
          h = t = h1;
          h1 = h1.next;
      } else {
          h= t= h2;
          h2 = h2.next;
      }


      while(h1 != null && h2 != null)
      {
          if(h1.data < h2.data){
              t.next = h1;
              t = t.next;
              h1 = h1.next;
          }
          else {
              t.next = h2;
              t = t.next;
              h2 = h2.next;
          }
      }

      if(h1 != null) {
          t.next = h1;
      }
      if(h2 != null) {t.next = h2;}

      return h;
  }

  
}

class Node {
  int data;
  Node next;

  Node(int x) {
    this.data = x;
    this.next = null;
  }
}
