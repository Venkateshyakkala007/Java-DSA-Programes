package Trees2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(12);
        root.right = new TreeNode(6);
        root.left.right = new TreeNode(-9);
        root.right.left = new TreeNode(-1);
        root.right.right = new TreeNode(10);
        root.right.left.left = new TreeNode(15);
        root.right.right.left = new TreeNode(9);
        root.right.right.left.right = new TreeNode(19);

       ArrayList<Integer> arr = new ArrayList<>();

       LOT(root,arr);
       System.out.println(arr);
    }

    public static void LOT(TreeNode root, ArrayList<Integer> arr)
    {
        TreeNode curr = root;
        // we need to use Queue for level order traversal
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.add(curr);

        while(!q.isEmpty())//q.size()>0
        {
            TreeNode front = q.poll();

            arr.add(front.val);

            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }


    }

    public static void LOT2(TreeNode root, ArrayList<ArrayList<Integer>> arr)
    {
        TreeNode curr = root;
        // we need to use Queue for level order traversal
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.add(curr);

        while(q.size() > 0)
        {
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 1; i <= size; i++)
            {
                TreeNode f = q.poll();
                list.add(f.val);

                if(f.left != null) q.add(f.left);
                if(f.right != null) q.add(f.right);
                
            }
            arr.add(list);
        }
        
    }

    public static void  inOrder(TreeNode root, ArrayList<Integer> arr)
    {
        if(root == null) return;

        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
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

