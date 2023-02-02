import java.util.*;

public class Main {
    public static void main(String[] args) {

        String string = "Любые слова привет как дела";
        String[] words = string.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("привет")) {
                continue;
            }
            System.out.println(words[i]);
        }
        TreeSet<Cucumber> cucumbers = new TreeSet<>();
        cucumbers.add(new Cucumber(13, 20, "gherkin"));
        cucumbers.add(new Cucumber(13, 20, "pickle"));
        System.out.println(cucumbers);

        Bitable cucumber1 = new Cucumber(20, 15, "pickle");
        cucumber1.bite();            // этот метод есть у интерфейса и у Cucumber
        // cucumber1.doWhatPickleDo();  // метод, который есть Cucumber

        LinkedList<String> names = new LinkedList<>();
        names.addFirst("Boba");
        names.addFirst("Koba");
        names.addFirst("Biba");
        List<String> names1 = new ArrayList<>(names);
        List<String> names2 = Arrays.asList("Boba", "Koba");
        List<String> names3 = List.of("Boba", "Koba", "Biba");
        List<String> names4 = new LinkedList<>(names);
        HashSet<String> names5 = new HashSet<>(Set.of("Boba", "Koba", "Biba"));
        System.out.println(names5);
        HashMap<String, Integer> numbersByNames = new HashMap<>(Map.of("Boba", 0, "Koba", 2));
        numbersByNames.put("Biba", 0);
        numbersByNames.putAll(Map.of("Bill", 0, "Jake", 2));

        numbersByNames.values();
        numbersByNames.keySet();
        // HashSet - не может быть одинаковых значений - либо по equals, либо compare
        // HashMap - не может быть одинаковых ключей - поэтому метод .keySet() возвращает нам
        // именно множество. Значения могут дублироваться - поэтому метод .values() возвращает
        // коллекцию, а не Set.
        System.out.println(numbersByNames);
        for (Map.Entry<String, Integer> entry : numbersByNames.entrySet()) {
            System.out.println(entry);
        }
        numbersByNames.put("Boba", numbersByNames.getOrDefault("Boba", 0) + 1);
        numbersByNames.putIfAbsent("Boba", 12); // работает, если нет еще такого ключа
        for (String key : numbersByNames.keySet()) {
            System.out.println(key + " " + numbersByNames.get(key));
        }
    }
}