public class Mansion extends Project {
    private int numberOfFloors;
    private int numberOfRooms = 10;
    private int square = 200;

    @Override
    public void calculatePrice() {
        super.budget = 10;
        System.out.println(super.getTitle() + " " + budget);
        System.out.println(numberOfFloors * 20_000 + numberOfRooms * 5_000 + square * 5000);
    }

    public Mansion(String title, double budget,
                   int numberOfFloors, int square,
                   int numberOfRooms) {
        super(title, budget);
        this.numberOfFloors = numberOfFloors;
        this.square = square;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public void info() { // бессмысленный метод
        super.info();
    }

    public Mansion() {
        System.out.println("Конструктор производного класса");
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getSquare() {
        return square;
    }

}
