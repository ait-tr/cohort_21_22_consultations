package fruits;

public class Orange {
    private int weight;

    protected Orange() {
        weight = (int) (Math.random() * 100);
    }

    protected Orange(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
