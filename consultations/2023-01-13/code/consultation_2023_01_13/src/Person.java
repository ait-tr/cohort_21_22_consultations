public class Person {
    private String name;
    private int id;
    private static int counter = 0;

    public Person(String name) {
        this.name = name;
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return id+"."+ name;
    }
}
