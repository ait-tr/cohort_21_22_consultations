public class Main {
    public static void main(String[] args) {

        Cat tom = new Cat("Tom");
        Mouse jerry = new Mouse("Jerry", "grey");
        Mouse pic = new Mouse("Pic", "black");

        System.out.println(Mouse.getNumberOfCaughtMice());
        tom.catchMouse(jerry);
        System.out.println(Mouse.getNumberOfCaughtMice());
        tom.catchMouse(pic);
        System.out.println(Mouse.getNumberOfCaughtMice());
        Cat.displayInfo(tom);
        jerry.setNumberOfCaughtMice(20); // подчеркивает, потому что вызываем от экземпляра
        System.out.println(Mouse.getNumberOfCaughtMice());
        System.out.println(jerry.getNumberOfCaughtMice());
        System.out.println(pic.getNumberOfCaughtMice());
    }
}