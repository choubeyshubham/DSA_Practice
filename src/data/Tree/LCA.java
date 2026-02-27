package data.Tree;

public class LCA {



    /*
    🧩 Lowest Common Ancestor (LCA) of Binary Tree

The Lowest Common Ancestor (LCA) of two nodes p and q in a binary tree is the lowest (deepest) node that has both p and q as descendants (a node can be a descendant of itself).

✅ Example
                3
               / \
              5   1
             / \ / \
            6  2 0  8
              / \
             7   4

     */

    void main() {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        TreeNode lca1 = lca(root, root.left, root.right);
        System.out.println("Test 1 Expected: 3 | Actual: " + lca1.val);

        // -------- TEST CASE 2 --------
        TreeNode lca2 = lca(root, root.left.left, root.left.right.right);
        System.out.println("Test 2 Expected: 5 | Actual: " + lca2.val);

        // -------- TEST CASE 3 --------
        TreeNode lca3 = lca(root, root.left.right.left, root.left.right.right);
        System.out.println("Test 3 Expected: 2 | Actual: " + lca3.val);

        // -------- TEST CASE 4 --------
        TreeNode lca4 = lca(root, root.left.left, root.right.right);
        System.out.println("Test 4 Expected: 3 | Actual: " + lca4.val);

        // -------- TEST CASE 5 (Same Node) --------
        TreeNode lca5 = lca(root, root.left, root.left);
        System.out.println("Test 5 Expected: 5 | Actual: " + lca5.val);
    }


    public static TreeNode lca(TreeNode root,TreeNode p, TreeNode q) {
        if(root==null || root==p|| root ==q)
            return root;
            TreeNode left=lca(root.left,q,p);
        TreeNode right=lca(root.right,q,p);


        if(left!=null && right!= null)
            return root;


        return (left!=null)?left:right;
    }



}