package Trees2;

import java.util.ArrayList;
import java.util.HashMap;

public class PostAndInorder {
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

        int[] post ={};
        int[] in={};
        int n = post.length;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < n; i++)
        {
            hm.put(in[i],i);
        }

        TreeNode curr = ConstructBinaryTree(post,0,n-1,in,0,n-1,hm);

        System.out.println(curr);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        inOrder(curr,arr);

        System.out.println(arr);

    }

    public static void inOrder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root == null) return;
        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);
    }

    public static TreeNode ConstructBinaryTree(int[] post, int sp,int ep, int[] in, int si, int ei,HashMap<Integer,Integer> hm)
    {
        if(sp > ep || si > ei) return null;

        TreeNode root = new TreeNode(post[ep]);

        int idx = hm.get(post[ep]);

        int ll = idx - si;

        root.left = ConstructBinaryTree(post,sp,sp+ll-1,in,si,idx-1,hm);
        root.right = ConstructBinaryTree(post,sp+ll,ep-1,in,idx+1,ei,hm);

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
        this.left =null;
        this.right = null;
    }
}
