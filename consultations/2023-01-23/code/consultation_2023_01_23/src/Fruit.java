public abstract class Fruit {
    String title;
    String color;

    public Fruit(String title, String color) {
        this.title = title;
        this.color = color;
    }
    public void toJam(){
        System.out.println("Это варенье из " + title);
    }

    @Override
    public String toString() {
        return "Fruit " + color +" "+ title;
    }
}
