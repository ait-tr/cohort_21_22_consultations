public class Spike implements Cloneable {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Spike(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Spike{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    protected Spike clone() throws CloneNotSupportedException {
        return (Spike) super.clone();
    }
}
