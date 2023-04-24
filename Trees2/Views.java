package Trees2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Views {
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
        
        leftViewOfTree(root, arr);
        
        System.out.println(arr);
        
        ArrayList<Integer> list = new ArrayList<>();

        rightViewOfTree(root, list);
        
        System.out.println(list);

       
    }

    public static void leftViewOfTree(TreeNode root, ArrayList<Integer> arr)
    {
        TreeNode curr = root;
        // we need to use Queue for level order traversal
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.add(curr);

        while(q.size() > 0)
        {
            int size = q.size();
            
            for(int i = 1; i <= size; i++)
            {
                TreeNode f = q.poll();
                
                if(i == 1) arr.add(f.val);

                if(f.left != null) q.add(f.left);
                if(f.right != null) q.add(f.right);
                
            }
        }
        
    }

    public static void rightViewOfTree(TreeNode root, ArrayList<Integer> arr)
    {
        TreeNode curr = root;
        // we need to use Queue for level order traversal
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.add(curr);

        while(q.size() > 0)
        {
            int size = q.size();
            
            for(int i = 1; i <= size; i++)
            {
                TreeNode f = q.poll();
                
                if(i == size) arr.add(f.val);

                if(f.left != null) q.add(f.left);
                if(f.right != null) q.add(f.right);
                
            }
        }
        
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