import java.util.Objects;

public class Tree {
    private String name;
    private int age;

    private String climate;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Tree(String name, int age, String climate) {
        this.name = name;
        this.age = age;
        this.climate = climate;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", climate='" + climate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return age == tree.age && Objects.equals(name, tree.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
