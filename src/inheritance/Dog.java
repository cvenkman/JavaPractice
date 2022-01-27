package inheritance;

public class Dog extends Animal {
//    private String name;

    public Dog() {
        super("dog");
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("woof");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }
}
