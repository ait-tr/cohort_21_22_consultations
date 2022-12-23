import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        System.out.println(animals.size());
        animals.add(new Bird());
        animals.add(new Fish());
        System.out.println(animals.size());
        ((Fish) animals.get(1)).getNumberOfFins(); // но это сложно, не забивайте себе голову
        // достали из листа и преобразовали в Fish
        Fish nemo = (Fish) animals.get(1);
        nemo.getNumberOfFins();
        // создали лист типа Fish - и нам стали доступны методы рыбы
        ArrayList<Fish> fishes = new ArrayList<>();
        fishes.add(nemo);
        System.out.println(fishes.get(0).getNumberOfFins());
        // повторим методы ArrayList
        ArrayList<Candy> previusCandies = new ArrayList<>();
        previusCandies.add(new Candy("Mercy", 30, "sphere"));
        ArrayList<Candy> candies = new ArrayList<>(previusCandies); // создали лист и скопировали предыдущий
        System.out.println(candies.size());
        System.out.println(candies);

        candies.add(new Candy("Rafaello", 30, "sphere"));
        candies.add(new Candy("Candy cane", 80, "cane"));
        System.out.println(candies);
        System.out.println(candies.get(2));
        candies.remove(1);
        System.out.println(candies.get(1));
        System.out.println(candies);
        candies.add(null);                        // добавили null
        candies.remove(candies.size() - 1); // удаляем последний элемент, это как раз наш null
        System.out.println(candies);
        candies.set(0, new Candy("Lind", 20, "bar"));

        System.out.println(candies);
        // вывод массивом
        for (int i = 0; i < candies.size(); i++) {
            System.out.println(candies.get(i));
        }

        candies.add(new Candy("Rafaello", 30, "sphere"));
        candies.add(new Candy("Rafaello", 30, "sphere"));
        candies.set(0, new Candy("Lind", 20, "bar"));
        candies.add(new Candy("Rafaello", 30, "sphere"));
        candies.add(new Candy("Rafaello", 30, "sphere"));
        System.out.println(candies);
        // удалим массивом что-нибудь
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).getForm().equals("sphere")) {
                candies.remove(i);
            }
        }
        System.out.println(candies);
        // но возникают проблемы не все удаляются

        candies.add(new Candy("Rafaello", 30, "sphere"));
        candies.add(new Candy("Rafaello", 30, "sphere"));
        System.out.println("______");
        // цикл с решением проблемы
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).getForm().equals("sphere")) {
                candies.remove(i);
                i--;
            }
        }
        System.out.println(candies);
        System.out.println("______");
        candies.add(new Candy("Rafaello", 30, "sphere"));
        candies.add(new Candy("Rafaello", 30, "sphere"));

        for (int i = candies.size() - 1; i >= 0; i--) {
            if (candies.get(i).getForm().equals("sphere")) {
                candies.remove(i);
            }
        }
        System.out.println(candies);
    }
}