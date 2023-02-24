public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public void catchMouse(Mouse mouse) {
        int newNumber = Mouse.getNumberOfCaughtMice() + 1;
        Mouse.setNumberOfCaughtMice(newNumber);
    }

    public static void displayInfo(Cat cat) {
        System.out.println("Some static info " + cat.getName());
    }
}
