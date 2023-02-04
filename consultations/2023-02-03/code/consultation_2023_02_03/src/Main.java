import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("123", "234", "123", "123", "777");
        Counter<String> counter = new Counter<>(list);
        Map<String, Integer> count = counter.count();
        System.out.println(count);

        Counter<Integer> counter1 = new Counter<>(List.of(1,2,3,3,2,1,1,1));
        System.out.println(counter1.count());

    }
}