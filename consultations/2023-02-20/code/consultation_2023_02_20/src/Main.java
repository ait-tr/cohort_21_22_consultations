import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Когда работаем с готовыми классами не требуется реализовывать Comparable или Comparator.
        TreeSet<String> composers = new TreeSet<>();
        composers.add("Bach");
        composers.add("Mozart");
        composers.add("Chaikovskiy");
        composers.add("Chaikovskiy");
        System.out.println(composers);
        // Когда работаем с классами, которые сами создали - требуется реализовывать Comparable или Comparator.
        // Пример Comparable:
        TreeSet<Composer> composers2 = new TreeSet<>();
        composers2.add(new Composer("Mozart", 28));
        composers2.add(new Composer("Bach", 30));
        composers2.add(new Composer("Chaikovsky", 60));
        composers2.add(new Composer("Tropina", 60));
        System.out.println(composers2);
        // Пример Comparator
        TreeSet<Composer> composers3 = new TreeSet<>(new Comparator<Composer>() {
            @Override
            public int compare(Composer o1, Composer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }.thenComparing(new Comparator<Composer>() {
            @Override
            public int compare(Composer o1, Composer o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        }));
        composers3.add(new Composer("Mozart", 28));
        composers3.add(new Composer("Bach", 30));
        composers3.add(new Composer("Chaikovsky", 60));
        composers3.add(new Composer("Tropina", 60));
        composers3.add(new Composer("Chaikovsky", 65));
        System.out.println(composers3);
        // Можем реализовать Comparator при помощи лямбда-выражения.
        // Пример с лямбдой делает то же, что и анонимный класс в примере выше.
        TreeSet<Composer> composers4 = new TreeSet<>((
                (Comparator<Composer>)
                        (o1, o2) -> o1.getName().compareTo(o2.getName()))
                .thenComparing(
                        (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge())
                )
        );

        // Queue - это интерфейс?
        // Классы, которые его реализуют:
        // 1. PriorityQueue
        // 2. ArrayDeque (он так же реализует интерфейс Deque)
        // 3. LinkedList (он так же реализует интерфейс Deque)

        PriorityQueue<String> fruits = new PriorityQueue<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Lime");
        System.out.println(fruits.poll()); // Apple
        System.out.println(fruits.poll()); // Banana

        // PriorityQueue, но с нашими классами - не забыли про comparable
        PriorityQueue<Fruit> fruits2 = new PriorityQueue<>();
        fruits2.offer(new Fruit("Orange", 200.2));
        fruits2.offer(new Fruit("Apple", 170.7));
        System.out.println(fruits2.poll()); // Apple
        System.out.println(fruits2.poll()); // Orange
        // мы можем передать в конструктор реализацию класса Comparator
        // будь то лямбда или анонимный класс
        PriorityQueue<Fruit> fruits3 = new PriorityQueue<>((
                (o1, o2) -> Double.compare(o1.getWeight(), (o2.getWeight()
                ))
        ));
        fruits3.offer(new Fruit("Orange", 50.2));
        fruits3.offer(new Fruit("Apple", 250.7));
        System.out.println(fruits3.poll()); // Apple
        System.out.println(fruits3.poll()); // Orange


        // LIFO - кто последний вошел - первый вышел
        // стопка блинов -___-

        // FIFO - первый вошел - первый и вышел
        // железнодорожный тоннель -->[]] -->

        // Инкапсуляция - это сокрытие реализации - т.е. мы не знаем, как реализован какой-то метод конкретно.
        // Мы знаем только, что он делает, но не знаем как именно это делает.
        System.out.println("String".toUpperCase());
        Fruit apple = new Fruit("Apple", 120d);
        System.out.println(apple.getNumberOfSeeds());
        // Полиморфизм - это возможность применения одноименных методов,
        // которые либо перегружаются, либо переопределяются. Это если очень кратко.
    }
}
