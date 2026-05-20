package data.Tree;

import data.TreeNodes;

public class IsValidBST {


    void main(){

        TreeNodes root = new TreeNodes(5);
        root.left = new TreeNodes(8);
        root.right = new TreeNodes(7);

        System.out.println(isValidBST(root));





    }

    public  boolean isValidBST(TreeNodes root){
//        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
        return isValid(root,null,null);
    }

    public  boolean isValid(TreeNodes node,Integer low,Integer high){
        if(node==null) return  true;
        if ((low != null && node.val <= low) || (high != null && node.val >= high)) {
            return false;
        }

        return isValid(node.left, low, node.val) && isValid(node.right, node.val, high);

    }



}
