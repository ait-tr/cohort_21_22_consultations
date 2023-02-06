import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> numbersPQ = new PriorityQueue<>();
        numbersPQ.offer(9);
        numbersPQ.offer(2);
        numbersPQ.offer(5);
        numbersPQ.offer(5); // добавляем

//        System.out.println(numbersPQ.poll()); // достаем и удаляем
//        System.out.println(numbersPQ.poll());
//        System.out.println(numbersPQ.poll());
//        System.out.println(numbersPQ.poll());
//        System.out.println(numbersPQ.poll());
//        System.out.println(numbersPQ);

        // numbersPQ.offer(null); // нельзя добавить null - будет ошибка
        // LIFO     FIFO
//        PriorityQueue<BabyPanda> pandasPQ = new PriorityQueue<>();
//        pandasPQ.offer(new BabyPanda("Fat Bob", 95, true));
//        pandasPQ.offer(new BabyPanda("Anna the Second", 95, true));
//        pandasPQ.offer(new BabyPanda("Ugly Po", 95, true));
//        pandasPQ.offer(new BabyPanda("Cute Bo", 95, true));
//
//        System.out.println(pandasPQ);
//        System.out.println(pandasPQ.poll());
//        System.out.println(pandasPQ.poll());
//        System.out.println(pandasPQ.poll());
//        System.out.println(pandasPQ.poll());
        PandasShelter pandemonium = new PandasShelter("Pandemonium");
        pandemonium.giveShelter(new BabyPanda("Fat Bob", 80, false));
        pandemonium.giveShelter(new BabyPanda("Anna the Second", 90, false));
        pandemonium.giveShelter(new BabyPanda("Ugly Po", 95, true));
        pandemonium.giveShelter(new BabyPanda("Cute Po", 60, true));

        System.out.println(pandemonium.sendToZoo());
        System.out.println(pandemonium.sendToZoo());
        System.out.println(pandemonium.sendToZoo());
        System.out.println(pandemonium.sendToZoo());
        System.out.println(pandemonium.sendToZoo());
    }
}