public class Parent {
    private int id;
    protected String name;

    public Parent(final int id, final String name) {
        this.id = id;
        this.name = name;
    } public void printId() {
        System.out.println("Parent id: " + this.id);
    }

    public void printName() {
        System.out.println("Parent Name: " + name);
    }
}
