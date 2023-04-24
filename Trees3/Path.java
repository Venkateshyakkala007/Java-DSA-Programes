// package Trees3;

import java.util.ArrayList;

public class Path {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(7);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(7);
        root.left.left = new TreeNode(9);
        root.left.left.left = new TreeNode(12);
        root.left.left.right = new TreeNode(19);
        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(18);
        root.right.left.left = new TreeNode(15);
        root.right.left.right = new TreeNode(-12);
        root.right.left.right.right = new TreeNode(6);


        ArrayList<Integer> arr = new ArrayList<>();

        boolean val = path(root,arr,6);

        System.out.println(val);
        System.out.println(arr);
        


    }

    public static boolean path(TreeNode root, ArrayList<Integer> list,int d)
    {
        if(root == null) return false;

        if(root.val == d) {
            list.add(root.val);
            return true;
        }

        if(path(root.left,list,d) 
        || path(root.right,list,d)){
            list.add(root.val);
            return true;
        }

        return false;
    }

    public static void inorder(TreeNode root, ArrayList<Integer> arr)
    {
        if(root == null) return;

        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right, arr);

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