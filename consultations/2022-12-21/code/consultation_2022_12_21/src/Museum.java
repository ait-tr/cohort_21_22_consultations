public class Museum extends CulturalObject {
    private String topic;

    private int numbersOfExponats;

    public Museum(String title, String topic, String adress, int numbersOfExponats) {
        super(title, adress);
        this.topic = topic;
        this.numbersOfExponats = numbersOfExponats;
    }

    @Override
    public void customPrint() {
        System.out.println(getTitle().toLowerCase());
    }

    @Override
    public String toString() {
        return "Museum";
    }

    public String toString2(int x, double z) {
        return "Museum, what a wonderful place ";
    }
}
