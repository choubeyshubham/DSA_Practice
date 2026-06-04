package data.Tree;

public class IsPerfectTree {

    private static int leaf=-1;


    void main(){
        // Binary tree
        //           10
        //        /     \
        //      20       30
        //     /  \     /  \
        //   40    50  60   70

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);

        if (isPerfect(root))
            System.out.println("True");
        else
            System.out.println("False");
    }




    public static boolean isPerfect(TreeNode root){
        leaf =-1;
        return solve(root, 0);
    }

    public static boolean solve(TreeNode root,int level){
        if(root==null)
            return true;

        if(root.left==null && root.right== null) {
            if (leaf == -1)
                leaf = level;
            return level==leaf;
        }

        if(root.left==null || root.right== null)
            return false;

        return solve(root.left,level+1) && solve(root.right,level+1);
    }






}
