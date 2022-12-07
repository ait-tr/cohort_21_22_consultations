import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Panda susha = new Panda();
        System.out.println(susha.getName());
        Toy[] toys = {
                new Toy("ball", "red", "sphere"),
                new Toy("log", "brown","cylindrical")
        };
        Panda smokeyEyes = new Panda(40, 12, false, "Smokey Eyes", toys, true);
        System.out.println(smokeyEyes);
    }
}