import java.util.Objects;

public class Soil {
    String title;

    public Soil(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soil soil = (Soil) o;
        return Objects.equals(title, soil.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
