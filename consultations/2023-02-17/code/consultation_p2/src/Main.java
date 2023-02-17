import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //
        HashSet<Integer> numbers = new HashSet<>();
        //
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(6);
        System.out.println(numbers);

        HashSet<Tree> trees = new HashSet<>();
        trees.add(new Tree("Birch", 12, "Temperate"));
        trees.add(new Tree("Pine", 15, "Subpolar"));
        trees.add(new Tree("Maple", 16, "Temperate"));
        trees.remove(new Tree("Maple", 16, "Subpolar"));
        trees.add(new Tree("Maple", 16, "Subpolar"));
        trees.removeIf((tree -> tree.getAge() == 16)); // не проходили этого // удалили по значению одного параметра
        trees.removeIf((tree -> tree.getAge() == 12 && tree.getName().equals("Birch"))); //удалим по двум параметрам
        System.out.println(trees);

        HashMap<Tree, Boolean> healthByTrees = new HashMap<>(); // true- здорово, false -больно
        healthByTrees.put(new Tree("Birch", 12, "Temperate"), false);
        healthByTrees.put(new Tree("Linden", 17, "Subtropical"), true);
        healthByTrees.put(new Tree("Coconut palm", 27, "Tropical"), true);
        healthByTrees.putIfAbsent(new Tree("Coconut palm", 27, "Tropical"), false);
        System.out.println(healthByTrees);
        Set<Tree> setOfTrees = healthByTrees.keySet();
        System.out.println(setOfTrees);

        String text = "Vova";  // выделило
        String text2 = "Vova";
        String text3 = new String("Vova");
        System.out.println(text == text2);
        System.out.println(text == text3);

        System.out.println(text.equals(text2));
        System.out.println(text.equals(text3));
    }
}
