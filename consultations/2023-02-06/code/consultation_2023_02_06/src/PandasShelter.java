import java.util.PriorityQueue;

public class PandasShelter {
    String title;
    PriorityQueue<BabyPanda> pandas = new PriorityQueue<>();

    public PandasShelter(String title) {
        this.title = title;
    }

    public void giveShelter(BabyPanda panda) {
        pandas.offer(panda);
    }

    public BabyPanda sendToZoo() {
        if (!pandas.isEmpty()) {
            System.out.println("Счастливого пути, " + pandas.peek().name);
        }
        return pandas.poll();
    }

}
