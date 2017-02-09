package q43;

public class Main43 {
    public static TreeNode logic(TreeNode[] list, int start, int last){
        if (last < start) return null;

        int mid = (start + last)/2;

        TreeNode root = list[mid];
        root.setLeft(logic(list, start, mid-1));
        root.setRight(logic(list, mid+1, last));
        if(root.getLeft() != null && root.getRight() != null) {
            System.out.println(root.data + "'s left:"+root.getLeft().data
                    +"\n" +root.data +"'s right: " +root.getRight().data);
        }
        return root;
    }
    public static void test (){

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode[] list = {a,b, c,d,e,f,g,h};
        TreeNode root = logic(list, 0,7);
        System.out.println(root.data);
    }
}
