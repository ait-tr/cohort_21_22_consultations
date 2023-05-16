import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = List.of("Jack","Valdemar", "Voland","Nick", "John", "Andy","Nicolaus");
        List<String> res1 = names.stream()
                .filter(s -> s.length() > 4)
                .map(s->s.toUpperCase())
                .filter(s->s.startsWith("V")||s.startsWith("N"))
                .map(s->s.substring(0,3))
                .toList();
        System.out.println(res1);

        long res2 = names.stream()
                .filter(s -> s.length() > 4)
                .count();
        System.out.println(res2);

        List<String> res3 = names.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(res3);

        Map<Integer, List<String>> res4 = names.stream().collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(res4);





    }
}
