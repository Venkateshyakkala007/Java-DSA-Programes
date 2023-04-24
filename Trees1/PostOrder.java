package Trees1;

import java.util.ArrayList;



public class PostOrder  {

    public static ArrayList<Integer> res = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(11);
        root.right = new TreeNode(14);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(2);
        root.right.right.right = new TreeNode(17);

        postOrder(root);
        System.out.println(res);
    }

    public static void postOrder(TreeNode root)
    {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        res.add(root.val);
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