package data.Tree;

public class SymmetricTree {
    /*
A binary tree is symmetric if it is a mirror of itself around its center.

That means:

Left subtree is a mirror reflection of the right subtree.

Structure + values must match.

     */


    void main() {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
/*
                1
               / \
              2   2
             / \ / \
            3  4 4  3
        */
        System.out.println("Expected: true | Actual: " + isSym(root));
    }


    public static boolean isSym(TreeNode root) {
        if (root == null)
            return false;
        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(TreeNode left, TreeNode right) {
       if(left==null||right==null) return true;
       if(left==null && right==null) return false;
       if(left.val!=right.val) return false;
       return isMirror(left.left,right.right)&& isMirror(left.right,right.left);
    }


}
