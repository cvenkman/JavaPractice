package interfaces;

/**
 * created by cvenkman on 1/27/22 inside the package - interfaces
 */
public class Main {
    public static void main(String[] args) {
        {
            Animal animal = new Animal(1);
            Person person = new Person("Bob");
            animal.sleep();
            animal.showInfo();
            person.sayHello();
            outputInfo(person);
        }
        System.out.println("---------");
        {
            Info animal = new Animal(2);
            Info person = new Person("Masha");
            person.showInfo();
            outputInfo(animal);
        }
    }
    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
