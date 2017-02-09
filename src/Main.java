import q42.Node;
import q43.Main43;

public class Main {

    public static void main(String[] args) {
//        animalShelter();
//        dfsExecute();
        Main43.test();

    }

    private static void dfsExecute() {
        Node reach = new Node("reach", null);
        Node a = new Node("a", null);
        Node b = new Node("b",null);
        Node c = new Node("c", new Node[] {a, b});
        Node d = new Node("c",new Node[] {a, reach, b, c});

        Node[] children = {a, b, c, d};
        Node start = new Node("start", children);
        dfs(start, reach);
    }


    public static boolean dfs (Node start, Node reach) {
        if (start == null || reach == null ||start.getChildren() == null) {
            return false;
        }

        for (Node child : start.getChildren()) {
            if (child == reach) {
                System.out.println("get reached");
                return true;
            }
            if (child.isVisited()) {
                continue;
            }
            child.setVisited();
            dfs(child, reach);
        }
        return true;
    }

    public static void animalShelter(){
        AnimalShelter as = new AnimalShelter();
        as.enqueue(new AnimalShelter.Cat());
        as.enqueue(new AnimalShelter.Dog());
        as.enqueue(new AnimalShelter.Cat());
        as.enqueue(new AnimalShelter.Dog());

        as.dequeueAny();
        as.dequeueBySpecies(new AnimalShelter.Cat());
        as.dequeueBySpecies(new AnimalShelter.Cat());
        as.dequeueBySpecies(new AnimalShelter.Dog());
        as.dequeueAny();
        as.dequeueAny();

    }

}
