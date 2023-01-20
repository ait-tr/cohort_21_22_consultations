public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static long getResult(ArrayProducer arrayProducer, ArrayHandler arrayHandler) {
         return arrayHandler.handle(arrayProducer.getArray());
    }
}