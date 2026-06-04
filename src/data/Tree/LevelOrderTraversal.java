package data.Tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    void main(){
        /*
         * Hardcoded Input Tree Structure:
         *         3
         *        / \
         *       9  20
         *          / \
         *         15  7
         */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> traversalResult = levelOrder(root);
        traversalResult.forEach(System.out::print);



    }



    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;

        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);

        while(!qu.isEmpty()){
            int size=qu.size();
            List<Integer> lvl= new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode curNode= qu.poll();
                lvl.add(curNode.val);
                if(curNode.left != null) qu.add(curNode.left);
                if(curNode.right!=null)qu.add(curNode.right);
            }
            res.add(lvl);
        }
        return res;
    }




}
