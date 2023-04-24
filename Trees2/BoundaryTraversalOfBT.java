package Trees2;

import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Stack;

public class BoundaryTraversalOfBT {

    public static ArrayList<Integer> Boundary = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(10);

       
        Boundary.add(root.val);
        leftBoundaryNodes(root.left);
        inOrder(root);
        rightBoundaryNodes(root.right);

        System.out.println(Boundary);
    }

    public static void leftBoundaryNodes(TreeNode root)
    {
        if(root == null || (root.left == null && root.right == null))
        {
            return;
        }   

        Boundary.add(root.val);
        if(root.left != null)
        {
            leftBoundaryNodes(root.right);
        } else{
            leftBoundaryNodes(root.left);
        }       
    }

    public static void rightBoundaryNodes(TreeNode root)
    {
        if(root == null || (root.left == null && root.right == null)) return;

        if(root.left != null)
        {
            rightBoundaryNodes(root.right);
        }else {
            rightBoundaryNodes(root.left);
        }
        Boundary.add(root.val);
    }

    public static void inOrder(TreeNode root)
    {
        if(root == null) return;

        if(root.left == null && root.right == null) Boundary.add(root.val);

        inOrder(root.left);
        inOrder(root.right);
    }

    
}


class TreeNode
{
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