public class Fruit implements Comparable<Fruit>{
    private String title;
    private Double weight;

    private int numberOfSeeds = 10;

    public int getNumberOfSeeds(){
        return numberOfSeeds;
    }


    public String getTitle() {
        return title;
    }

    public Double getWeight() {
        return weight;
    }

    public Fruit(String title, Double weight) {
        this.title = title;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "title='" + title + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        if (o.title.equals(this.title)){
            return Double.compare(this.weight, o.weight);
        }
        return title.compareTo(o.title);
    }
}
