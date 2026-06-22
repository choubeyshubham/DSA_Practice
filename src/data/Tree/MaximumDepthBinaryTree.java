package data.Tree;

public class MaximumDepthBinaryTree {
    void main(){
// Representation of the input tree:
        //     12
        //    /  \
        //   8   18
        //  / \
        // 5   11
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(8);
        root.right = new TreeNode(18);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(11);

        System.out.println(height(root));




    }

    public static int height(TreeNode node){
        if(node==null) return 0;

        int left=height(node.left);
        int right=height(node.right);

        return Math.max(left,right)+1;
    }









}
