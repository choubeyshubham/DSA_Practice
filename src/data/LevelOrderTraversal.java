package data;

import java.util.List;

public class LevelOrderTraversal {

    void main(){
 /*
                3
               / \
              9  20
                 / \
                15  7
        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);


    }


    public static List<List<Integer>> levelOrder(TreeNode root){



    }




}
