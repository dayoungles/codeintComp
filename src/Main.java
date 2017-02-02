public class Main {

    public static void main(String[] args) {
        animalShelter();
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
