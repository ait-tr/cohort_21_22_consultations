public class Decaf extends Coffee {
    private String title;

    public String getTitle() {
        return title;
    }

    public Decaf(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Decaf{" +
                "title='" + title + '\'' +
                '}';
    }


}
