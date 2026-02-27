package data.Tree;

import data.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    void main(){

//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(7);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(9);

        System.out.println("Before Inversion (Level Order):");
//        levelOrder(root);
//
//        invert(root);
//
//        System.out.println("After Inversion (Level Order):");
//        levelOrder(root);

    }
    // Helper method: Level Order Traversal (to verify result)
    public static void levelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("null");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
//            System.out.print(node.val + " ");
//
//            if (node.left != null) queue.offer(node.left);
//            if (node.right != null) queue.offer(node.right);
        }
        System.out.println();
    }


    public static TreeNode invert(TreeNode root){
       if(root==null){
           return null;
       }

//       TreeNode temp=root.left;
//       root.left=root.right;
//       root.right=temp;
//
//       invert(root.left);
//       invert(root.right);


       return root;
    }






}
