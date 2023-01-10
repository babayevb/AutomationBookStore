public class Demo {
    public static void main(String args[]) {
        Parent parent = new Parent(1, "Parent");
        parent.printId();
        parent.printName();
        parent = new Child(2, "Child");
        parent.printId();
        parent.printName();
    }
}

