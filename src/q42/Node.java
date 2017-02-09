package q42;

public class Node {
    String name;
    Node[] children;
    boolean isVisited = false;

    public Node(String name, Node[] children) {
        this.name = name;
        this.children = children;
    }

    public void setVisited() {
        this.isVisited = true;
    }

    public boolean isVisited() {
        System.out.println(this.name + " is visited: " + this.isVisited );
        return this.isVisited;
    }

    public Node[] getChildren() {
        return children;
    }
}
