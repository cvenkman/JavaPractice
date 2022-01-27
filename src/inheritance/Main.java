package inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println("-------------");

        Dog nameless_dog = new Dog();
        System.out.println(nameless_dog.getName());
        nameless_dog.eat();
        nameless_dog.sleep();

        System.out.println("-------------");

        Dog dog = new Dog("doggo");
        System.out.println(dog.getName());
        dog.eat();
        dog.sleep();
    }
}
