public class Child extends Parent {
    private int id;

    public Child(final int id, final String name) {
        super(id, name);
        this.id = id;
        this.name = name;
    }

    public void printId() {
        System.out.println("Child id: " + this.id);
    }

    public void printName() {
        System.out.println("Child Name: " + name);
    }
}
