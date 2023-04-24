public class SumTree {

    static int ans = 1; // consider this as sumtree

    public static void main(String[] args) {
        TreeNode root = new TreeNode(26);
        root.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(3);

        
        SumTreeValue(root);

        System.out.println(ans);

    }

    public static   int  SumTreeValue(TreeNode root)
    {
        if(root == null) return 0;

        if(root.left == null && root.right == null) {
            return root.val;
        }

        int l = SumTreeValue(root.left);
        int r = SumTreeValue(root.right);

        if(root.val != (l+r)){
            ans =0;
        }

        return root.val+l+r;
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
