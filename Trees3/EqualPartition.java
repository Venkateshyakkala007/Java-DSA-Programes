import java.util.HashMap;
// import java.util.HashSet;

public class EqualPartition {

    public static int sum =0;
    public static HashMap<Integer,Integer> hm = new HashMap<>();
    // public static HashSet<Integer> hs = new HashSet<>();
    public static void main(String[] args) {
        // TreeNode root = new TreeNode(5);
        // root.left = new TreeNode(3);
        // root.right = new TreeNode(7);
        // root.left.left = new TreeNode(4);
        // root.left.right = new TreeNode(6);
        // root.right.left = new TreeNode(5);
        // root.right.right = new TreeNode(6);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(20);
        root.right.right = new TreeNode(2);

         inOrder(root);
        System.out.println(sum);
        System.out.println();
        System.out.println(hm);

        if(sum % 2 == 0 && hm.containsKey(sum /2)){
            System.out.println("Yes we can do equal partitions");
        } else {
            System.out.println("No we can not do equal partitions ");
        }

    }

    public static int inOrder(TreeNode root)
    {
        if(root == null) return 0;

        sum = root.val + inOrder(root.left)+inOrder(root.right);
        hm.put(sum, hm.getOrDefault(sum,0)+1);
        return sum;
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
