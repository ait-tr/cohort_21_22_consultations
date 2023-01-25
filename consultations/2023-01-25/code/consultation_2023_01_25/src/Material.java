import java.util.Objects;

public class Material {
    String title;
    double price;
    String description;

    public void make(){
        Tools.print();
    }

    public Material(String title, double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Material{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return Double.compare(material.price, price) == 0 && Objects.equals(title, material.title) && Objects.equals(description, material.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }

    public class Tools{
        public static void print(){
            System.out.println("asdasdas");
        }
    }
}
