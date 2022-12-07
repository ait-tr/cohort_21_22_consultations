public class Toy {
    private String title;
    private String color;
    private String form;

    public Toy(String title, String color, String form) {
        this.title = title;
        this.color = color;
        this.form = form;
    }

    @Override
    public String toString() {
       return color + " " +  form + " " + title;
    }
}

