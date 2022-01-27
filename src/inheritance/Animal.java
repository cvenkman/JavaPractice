package inheritance;

public class Animal {
    protected String name = "nameless ";

    public Animal(String name) {
        this.name += name;
    }

    public Animal() {
        this.name += "animal";
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
