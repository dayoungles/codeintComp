package q43;

public class TreeNode {
    int data;
    String name;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.name = Integer.toString(data);
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
