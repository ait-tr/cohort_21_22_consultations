public class Printer {
    public static <T> T print(T[] objects) {
        return objects[0];
    }

    public static <T extends Coffee> T methode2(String title) {
        return (T) new Decaf(title);
    }

    public static void print(int x) {
        System.out.println(x);
    }

    public static void print(double x) {
        System.out.println(x);
    }

    public static <T> void print2(T x) {
        System.out.println(x);
    }

    public static <T> void specialPrint(T x) {
        if (x instanceof Coffee || x instanceof Double) {
            System.out.println(x + " of class " + x.getClass());
        }
    }
}
