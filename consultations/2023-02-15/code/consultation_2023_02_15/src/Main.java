import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hey");
        print(new Animal());
        print(new HoneyBadger());


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        print(animals);

        ArrayList<HoneyBadger> badgers = new ArrayList<>();
        badgers.add(new HoneyBadger());
        badgers.add(new HoneyBadger());
        print(badgers);

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 6));
        printNumbers(numbers);

        ArrayList<Bee> bees = new ArrayList<>();
        printBeeAnimals(animals);
        printBeeAnimals(bees);

        ArrayList<Organism> organisms = new ArrayList<>();
        organisms.add(new Organism());
        printBeeAnimals(organisms);

    }

    public static void print(Animal animal) {
        System.out.println(animal);
    }

    // wild card  - ?
    // используем либо с ключевым словом extends, либо super, либо без ключевых слов <?>
    public static void print(ArrayList<? extends Animal> animals) {
        System.out.println(animals);
    }

    public static void printNumbers(ArrayList<? extends Number> numbers) {
        System.out.println(numbers);
    }

    public static <T extends Number & Countable> void printCountable(ArrayList<? extends T> numbers) {
        System.out.println(numbers);
    }

    public static void printBeeAnimals(ArrayList<? super Bee> animOrBees) {
        System.out.println(animOrBees);
    }
    // базовый класс инструмент и ударный - ребенок, духовой - ребенок 2

}
