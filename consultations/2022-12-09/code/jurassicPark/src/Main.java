public class Main {
    public static void main(String[] args) {
        Dinosaur diplodocus = new Dinosaur("Diplo", 2000, 2, "blue", false);
        System.out.println(diplodocus);
        JurassicPark park = new JurassicPark(
                "Park of Jurassic Period",
                12312,
                new Dinosaur[]{
                        new Dinosaur("Trex", 2500, 3.6, "green", true),
                        diplodocus,
                        new Dinosaur("Triceratops", 600, 2, "green", false)
                }
        );
        System.out.println(park);
        System.out.println(park.getDinosaurs()[2]);

        System.out.println("______get by weight____");
        Dinosaur dino1 = park.getDinoWeightsMoreThan(1000);
        System.out.println(dino1);
        System.out.println(park.getDinoNameByWeight(1500));
        // метод съесть лягушку
        // если съест лягушку - вес динозавра увеличится на 80% от веса лягушки если съедобная
        Frog hermit = new Frog();
        hermit.setToxic(true);
        System.out.println(diplodocus);
        diplodocus.eat(hermit);
        System.out.println(diplodocus);
    }
}