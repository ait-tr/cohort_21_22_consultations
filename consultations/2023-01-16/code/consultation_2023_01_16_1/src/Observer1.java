public class Observer1 implements Observer{
    @Override
    public void handleEvent(String msg) {
        System.out.println("Observer1");
        System.out.println(msg);
        System.out.println("Пляшем!");

    }
}
