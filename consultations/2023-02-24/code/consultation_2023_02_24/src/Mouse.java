public class Mouse {
    private static int numberOfCaughtMice = 0;

    private String name;
    private String color;

    public static int getNumberOfCaughtMice() {
        return numberOfCaughtMice;
    }

    public static void setNumberOfCaughtMice(int numberOfCaughtMice) {
        Mouse.numberOfCaughtMice = numberOfCaughtMice;
      /*

      в статических методах мы можем обращаться только к статическим переменным
      и только к статическим методам!

      */
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Mouse(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
