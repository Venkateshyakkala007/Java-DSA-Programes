import java.util.ArrayList;

class DepthOfTree{
    // static int count = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(25);
        root.right.left = new TreeNode(30);
        root.right.right = new TreeNode(35);

       
        // ArrayList<Integer> arr = new ArrayList<Integer>();

        int count = findDepth(root,25);

        System.out.println(count-1);
        
    }

    public static int findDepth(TreeNode root, int target) {
        if (root == null) {
            return 0;
        }
        if (root.val == target) {
            return 1;
        }
        int leftDepth = findDepth(root.left, target);
        if (leftDepth > 0) {
            return leftDepth + 1;
        }
        int rightDepth = findDepth(root.right, target);
        if (rightDepth > 0) {
            return rightDepth + 1;
        }
        return 0;
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