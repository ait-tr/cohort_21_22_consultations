public class Waste {
    private double volume;
    private double weight;
    private boolean isRecyclable;

    public void use() {
        if (isRecyclable) {
            System.out.println("recycle");
        } else {
            System.out.println("utilize");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public boolean getIsRecyclable() {
        return isRecyclable;
    }

    public void setIsRecyclable(boolean isRecyclable) {
        this.isRecyclable = isRecyclable;
    }

    public Waste() {
        System.out.println("Вызывается конструктор базового класса");
    }

    public Waste(double weight, double volume, boolean isRecyclable) {
        this.isRecyclable = isRecyclable;
        this.weight = weight;
        this.volume = volume;
    }

    public String toString() {
        return "Base " + volume + " " + weight + " " + isRecyclable;
    }
}
