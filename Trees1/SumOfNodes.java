package Trees1;

public class SumOfNodes {
    // public static int sum =0;

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

        int sum = sum(root);

        System.out.println(sum);
    }

    public static int sum(TreeNode root)
    {
        if(root == null) return 0;

        int left = sum(root.left);
        int right = sum(root.right);

        return root.val + left+right;
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
