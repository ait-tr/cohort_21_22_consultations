public class Dinosaur {
    private String title;
    private double weight;
    private double height;
    private String color;
    private boolean isCarnivor;


    // getters
    public String getTitle() {
        return title;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsCarnivorous() {
        return isCarnivor;
    }

    // сигнатура метода - это тип возвращаемого значения + имя метода + типы параметров
    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsCarnivor(boolean isCarnivor) {
        this.isCarnivor = isCarnivor;
    }
    // constructors
    public Dinosaur(String title, double weight, double height, String color, boolean isCarnivor) {
        this.title = title;
        this.weight = weight;
        this.height = height;
        this.color = color;
        this.isCarnivor = isCarnivor;
    }
    // methods
    public String toString(){
        return "  " + title +" " + weight + " " + color + "\n" ;
    }
}
