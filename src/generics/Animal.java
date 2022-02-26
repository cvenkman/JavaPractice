package generics;

public class Animal {
    public int id;

    public Animal() {}

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("i am sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + '}';
    }
}
