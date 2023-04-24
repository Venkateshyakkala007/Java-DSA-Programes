

public class DistancesBlwNodesInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(11);

        int distances = distances(root,2,11);

        System.out.println(distances);
    }

    /*
     * 1. find the lca of these two nodes
     * 2. find the distances from lca to given nodes
     * 3. return the sum of the distances of two nodes
     */

    // step1 is completed here
     public static TreeNode findLCA(TreeNode root, int n1, int n2)
     {
        if(root == null) return null; // we reach the end of the tree


        if(root.val == n1 || root.val == n2) return root;

        if((root.val > n1 && n2 > root.val) || (root.val < n1 && root.val > n2)) return root;
        
        if(root.val > n1 && root.val > n2) {
            return findLCA(root.left, n1, n2);
        } 

        return findLCA(root.right, n1, n2);
     }

     // step2 is find the distances from lca to given node

     public static int findDistance(TreeNode root,int n,int distances)
     {
        if(root == null) return -1;

        if(root.val == n) return distances;

        if(n < root.val) return findDistance(root.left, n,distances+1);

        return findDistance(root.right, n,distances+1);
     }

     // final step sum of the distances

     public static int distances(TreeNode root, int n1, int n2)
     {
        TreeNode lca = findLCA(root, n1, n2);

        int dist1 = findDistance(lca, n1,0);
        System.out.println(dist1);
        int dist2 = findDistance(lca, n2,0);
        System.out.println(dist2);

        return (dist1+dist2);


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