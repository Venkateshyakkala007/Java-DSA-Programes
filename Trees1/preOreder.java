package Trees1;

import java.util.ArrayList;

public class preOreder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.right = new TreeNode(14);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(15);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(2);
        root.right.right.right = new TreeNode(17);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        preOrder(root,arr);

        System.out.println(arr);
        

    }

    // L D R
    public static void preOrder(TreeNode root, ArrayList<Integer> arr)
    {
        if(root == null) return ;

        arr.add(root.val);
        preOrder(root.left, arr);
        preOrder(root.right, arr);

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
