import java.util.Objects;

public class Lock {
    String title;
    String material;

    @Override
    public String toString() {
        return "Lock{" +
                "title='" + title + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public Lock(String title, String material) {
        this.title = title;
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lock lock = (Lock) o;
        return Objects.equals(title, lock.title) && Objects.equals(material, lock.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, material);
    }
}
