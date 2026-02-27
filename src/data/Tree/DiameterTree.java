package data.Tree;

public class DiameterTree {
    /*
    🌳 Diameter of Binary Tree

The Diameter of a binary tree is the length of the longest path between any two nodes in the tree.

     */
    public static int diameter=0;

    public static int diaBT(TreeNode root){
        diameter=0;
        height(root);
        return diameter;
    }

    public static int height(TreeNode node){
        if(node==null)
            return 0;
        int left =height(node.left);
        int right=height(node.right);
        diameter =Math.max(diameter,left+right);
        return 1+Math.max(left,right);
    }

    void main(){
        /*
                1
               / \
              2   3
             / \
            4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int result = diaBT(root);
        System.out.println("Diameter (Expected 3): " + result);
    }




}
