package Trees1;



public class InOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(7);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(15);
        root.left.right.left = new TreeNode(20);
        root.left.right = new TreeNode(10);
        root.right.left.left = new TreeNode(19);
        root.right.right = new TreeNode(20);
        root.right.left.right = new TreeNode(40);

        inorder(root);
    }

    // L N R
    public static void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}

class TreeNode{
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
