package Trees5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math;

public class VerticalOrderTraversal 
{
//     public static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
//     public static int min =0;
//     public static int max =0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(6);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(11);
        root.left.left.left.right = new TreeNode(14);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(5);
        root.left.right.left.right = new TreeNode(19);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(12);
        
         verticalOrderTraversal(root);

    }

    public static void verticalOrderTraversal(TreeNode root) {
        // creating hashmap to store the level and list of the binary tree
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
    
        // creating queue for travel in level order
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
    
        int min = 0, max = 0;
    
        while (!q.isEmpty()) {
            int n = q.size();
    
            for (int i = 1; i <= n; i++) {
                Pair curr = q.poll();
    
                TreeNode node = curr.node;
                int currVal = node.val;
                int l = curr.level;
    
                // if (hm.containsKey(l)) {
                //     hm.get(l).add(currVal);
                // } else {
                //     hm.put(l, new ArrayList<Integer>());
                //     hm.get(l).add(currVal);
                // }
                // instead of 6 lines of code we can use this one line to reduce the code
                /*
                 * The hm.computeIfAbsent(l, k -> new ArrayList<>()) method call is used to get the list of integers associated with the current level l from the hm map.

If the level l is already present in the map, the associated list of integers is returned by the computeIfAbsent() method.
If the level l is not present in the map, the computeIfAbsent() method creates a new key-value pair in the map, with the key being l and the value being a new ArrayList of integers. The ArrayList is created using a lambda expression k -> new ArrayList<>(), which is a shorthand for the Function interface. This lambda expression takes a key k as input and returns a new ArrayList instance.
Finally, the add(currVal) method is called on the returned list to add the current node value currVal to the list. This way, we can store all the nodes that belong to the same vertical level in a list associated with that level key in the hm map.
                 */
                hm.computeIfAbsent(l, k -> new ArrayList<>()).add(currVal);
    
                if (node.left != null) {
                    q.add(new Pair(node.left, l - 1));
                    min = Math.min(min, l - 1);
                }
    
                if (node.right != null) {
                    q.add(new Pair(node.right, l + 1));
                    max = Math.max(max, l + 1);
                }
            }
    
        }
    
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            ans.add(hm.getOrDefault(i, new ArrayList<Integer>()));
        }
    
        System.out.println(ans);
    }
    
}

class Pair 
{
    TreeNode node;
    int level;

    Pair(TreeNode n, int x)
    {
        this.node = n;
        this.level = x;
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