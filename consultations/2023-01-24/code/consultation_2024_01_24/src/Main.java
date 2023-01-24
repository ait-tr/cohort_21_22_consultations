import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // static vs non-static
        Panda stepan = new Panda("Stepan", 160);
        System.out.println(Panda.pandasPopulation);
        stepan.introduce();
        Panda.introduce(stepan);
        // Exceptions
        // try, catch, finally, throw, throws

        Sportsman igor = new Sportsman();
        igor.warmUp();
        try {
            igor.runTenMiles();
        } catch (SportsmanWarmUpException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        // ошибки и finally

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите целое число");
//        try {
//            String x = scanner.nextLine();
//            System.out.println(x);
//            System.out.println(Integer.parseInt(x));
//        } catch (NoSuchElementException e){
//            e.printStackTrace();
//        } finally {
//            scanner.close(); // то, что должны обязательно сделать
//            System.out.println("Закрываем сканер");
//        }


        // toString
        System.out.println(igor.toString());
        System.out.println(igor.getClass().getName());
        System.out.println(igor.hashCode());
        System.out.println(Integer.toHexString(igor.hashCode()));
        Sportsman sp1 = new Sportsman();
        Sportsman sp2 = new Sportsman();
        System.out.println(sp1.hashCode());
        System.out.println(sp2.hashCode());
        HashSet<Sportsman> sportsmen = new HashSet<>();
        sportsmen.add(sp1); // true
        sportsmen.add(sp2); // false
        System.out.println(sportsmen);
    }
}