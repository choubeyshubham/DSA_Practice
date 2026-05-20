package data;

public class TreeNodes {


    public int val;
    public TreeNodes left;
    public TreeNodes right;

    TreeNodes() {
    }

    public TreeNodes(int val) {
        this.val = val;
    }

    public TreeNodes(int val, TreeNodes left, TreeNodes right) {
        this.val = val;
        this.left = left;
        this.right = right;

    }

}