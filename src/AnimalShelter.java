import java.util.LinkedList;
import java.util.Random;

public class AnimalShelter {
    public LinkedList<Animal> animalList;

    public AnimalShelter() {
        this.animalList = new LinkedList<Animal>();
    }

    public void addAnimal() {
        int rand = new Random().nextInt() % 2;
        if (rand == 0) {
            this.animalList.add(new Dog());
        } else {
            this.animalList.add(new Cat());
        }
    }

    public void setAnimalList(LinkedList<Animal> animalList) {
        this.animalList = animalList;
    }

    public void enqueue (Animal animal){
        animalList.add(animal);
    }

    public void dequeueAny (){
        if (animalList.size() == 0) {
            System.out.println("out of animal");
            return;
        }
        animalList.removeFirst().getSpecies();
    }

    public void dequeueBySpecies (Animal species){
        if (animalList.size() == 0) {
            System.out.println("out of animal");
            return;
        }
        for (int i = 0; i < animalList.size(); i++) {
            Animal waitAnimal= animalList.get(i);
            if (waitAnimal.getClass() != species.getClass()){
                continue;
            } else {
                animalList.remove(i).getSpecies();
                return;
            }
        }
        System.out.println("no species");
    }

    public void dequeueCat (){

    }



    public abstract static class Animal {
        public abstract void getSpecies();
    }
    public static class Cat extends Animal {
        @Override
        public void getSpecies() {
            System.out.println("caaaaaaat");
        }
    }
    public static class Dog extends Animal {
        @Override
        public void getSpecies() {
            System.out.println("doooooooooog");
        }
    }
}
