public class Cucumber implements Comparable<Cucumber>, Bitable  {
    int lumbsNumber;
    int seedsNumber;
    String sort;

    public Cucumber(int lumbsNumber, int seedsNumber, String sort) {
        this.lumbsNumber = lumbsNumber;
        this.seedsNumber = seedsNumber;
        this.sort = sort;
    }

    @Override
    public int compareTo(Cucumber o) {
        return Integer.compare(lumbsNumber, o.lumbsNumber);
    }

    @Override
    public void bite() {
        System.out.println("Ням-ням, вкусный огурчик!");
    }

    public void doWhatPickleDo(){
        System.out.println("Веду себя как обычный огурец");
    }
}
