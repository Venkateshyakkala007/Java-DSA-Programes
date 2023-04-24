package Trees1;

public class InvertBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.right.right.left = new TreeNode(3);

        TreeNode curr = inverBT(root);

        System.out.println(curr);
    }

    static TreeNode inverBT(TreeNode root)
    {
        if(root == null) return null;

        TreeNode mirrorLeft = inverBT(root.left);
        TreeNode mirrorRight = inverBT(root.right);

        root.left = mirrorRight;
        root.right = mirrorLeft;

        return root;
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