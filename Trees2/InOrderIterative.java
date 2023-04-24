package Trees2;

import java.util.ArrayList;
import java.util.Stack;

// import Trees1.InOrder;

public class InOrderIterative {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(7);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(9);
        root.left.left.right = new TreeNode(10);
        root.left.left.right.left = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(20);
        root.right.left.left = new TreeNode(19);
        root.right.left.left.right = new TreeNode(40);

        inorderiterative(root);

    }

    public static void inorderiterative(TreeNode root)
    {
        TreeNode curr = root;
        Stack<TreeNode> stk = new Stack<TreeNode>();

        while(stk.size() >0 || curr != null)
        {

            while(curr != null)
            {
                stk.push(curr);
                curr = curr.left;
            }
            curr = stk.pop();
            System.out.print(curr.val +" ");
            curr = curr.right;
        }
    }


    public static void inorder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root == null) return;

        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x)
    {
        this.val = x;
        this.left = null;
        this.right = null;
    }
}
