package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(1));
        animals.add(new Animal(2));
        printAnimalsInList(animals);

        System.out.println("----------------");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        printAnimalsInList(dogs);
    }

    private static void printAnimalsInList(List<? extends Animal> list) {
        for (Animal animal : list) {
//            System.out.println(animal);
            animal.sleep();
        }

    }
}
