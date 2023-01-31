import java.util.Objects;

public class Car {
    private String number;
    private String model;
    private int year;

    private double price;
    private int mileage;

    public Car(String number, String model, int year, double price, int mileage) {
        this.number = number;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (mileage != car.mileage) return false;
        if (getNumber() != null ? !getNumber().equals(car.getNumber()) : car.getNumber() != null) return false;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getNumber() != null ? getNumber().hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + mileage;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price='" + price + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
