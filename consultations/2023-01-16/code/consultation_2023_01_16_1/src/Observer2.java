public class Observer2 implements Observer{
    @Override
    public void handleEvent(String msg) {
        System.out.println("Observer2");
        System.out.println(msg);
        System.out.println("Прыгаем!");

    }
}
