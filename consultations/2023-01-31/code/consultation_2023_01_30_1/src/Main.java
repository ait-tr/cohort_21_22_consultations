import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add( new Car("BX01", "bmw", 2000, 3000.00, 300000));
        cars.add(new Car("BX02", "bmw", 2001, 3001.00, 400000));
        cars.add(new Car("BX03", "bmw", 2002, 3002.00, 500000));
        cars.add(new Car("BX04", "bmw", 2003, 3003.00, 600000));

        System.out.println("------------------- List без дубликатов -------------");
        System.out.println("Первый метод: "+isCarsUnique1(cars));
        System.out.println("Второй метод: "+isCarsUnique2(cars));

        System.out.println("------------------- List без НЕ правильных дубликатов -------------");
        cars.add(new Car("BX03", "bmw", 2002, 3002.00, 500000));
        cars.add(new Car("BX04", "bmw", 2003, 3003.00, 600000));
        System.out.println("Первый метод: "+isCarsUnique1(cars));
        System.out.println("Второй метод: "+isCarsUnique2(cars));

        System.out.println("------------------- List с НЕ правильными дубликатами -------------");
        cars.add(new Car("BX03", "bmw", 2012, 3002.00, 500100));
        System.out.println("Второй метод: "+isCarsUnique2(cars));


    }

    static boolean isCarsUnique2(List<Car> carsList) {
        /*
        Дан список машин (номер, марка, год выпуска, цена, пробег), написать метод, который определит есть ли в списке "ошибки"
        т.е. машины совпадающие по номеру, но не совпадающие по любому из остальных параметров.
         */
        Set<Car> carsSet1 = new TreeSet<>(new CarComparatorByNumber());
        carsSet1.addAll(carsList);
        Set<Car> carsSet2 = new HashSet<>(carsList);

        return carsSet1.size() != carsSet2.size();
    }

    static boolean isCarsUnique1(List<Car> carsList) {
        /*
        Дан список машин (номер, марка, год выпуска, цена, пробег), написать метод, который определит есть ли в списке "двойники"
т.е. машины совпадающие по номеру
         */
        Set<Car> carsSet1 = new TreeSet<>(new CarComparatorByNumber());
        carsSet1.addAll(carsList);

        return carsSet1.size() != carsList.size();
    }



}