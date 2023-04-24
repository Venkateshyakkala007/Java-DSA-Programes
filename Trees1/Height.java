package Trees1;

public class Height {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(11);
        root.right = new TreeNode(14);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(2);
        root.right.right.right = new TreeNode(17);

        int heightOfTree =  Height(root);

        System.out.println(heightOfTree);
    }

    static int left =0;
    static int right =0;
    // this height is based on nodes
    public static int Height(TreeNode root)
    {
        // if(root == null) return 0; // it is based on the nodes 
        // height of the leaf node is 0

        // if it is based on the edges the base of null -1
        if(root == null) return -1;
        left = Height(root.left);
        right = Height(root.right);

        return 1+Math.max(left,right);

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