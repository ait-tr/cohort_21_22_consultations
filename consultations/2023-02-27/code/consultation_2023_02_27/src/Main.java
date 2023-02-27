import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> namesByNumbers = new HashMap<>();
        namesByNumbers.put(1, "Old man");
        namesByNumbers.put(2, "John");
        namesByNumbers.put(5, "Igor");
        namesByNumbers.put(5, "Igor");
        System.out.println(namesByNumbers.put(256, "Marina"));
        System.out.println(namesByNumbers.put(256, "Vova"));
        System.out.println(namesByNumbers.keySet());
        System.out.println(namesByNumbers.values());

        // Бакет: Энтри1(5, "Igor"), Энтри2(256, "Vova")
        // сначала сравниваем хэш-код ключа,
        // если совпадает - сравниваем ключи по equals
        // если хэшкод не совпадает - то не станет использовать equals
        System.out.println(namesByNumbers.putIfAbsent(3, "Serge"));
        System.out.println(namesByNumbers);
        System.out.println(namesByNumbers.get(5));
        System.out.println(namesByNumbers.entrySet());
        for (Map.Entry<Integer, String> entry : namesByNumbers.entrySet()) {

        }
        Bicycle linux = new Bicycle("Linux-best-pedals");
        linux.showPedalsBrand();


        Human adam = new Human("Adam");
        adam.live();
    }
}