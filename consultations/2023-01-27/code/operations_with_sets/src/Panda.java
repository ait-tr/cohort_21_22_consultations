import java.util.Objects;

public class Panda {
    private String name;

    public Panda(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Panda{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Panda panda = (Panda) o;
        return Objects.equals(name, panda.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
