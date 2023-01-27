import java.util.Objects;

public class Fruit {
    private String title;

    public Fruit(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(title, fruit.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
