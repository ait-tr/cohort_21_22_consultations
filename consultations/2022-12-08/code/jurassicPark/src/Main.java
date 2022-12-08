public class Main {
    public static void main(String[] args) {
        Dinosaur diplodocus = new Dinosaur("Diplo", 2000, 2, "blue", false);
        System.out.println(diplodocus);
        JurassicPark park = new JurassicPark(
                "Park of Jurassic Period",
                12312,
                new Dinosaur[]{
                        new Dinosaur("Trex", 540, 3.6, "green", true),
                        diplodocus,
                        new Dinosaur("Triceratops", 600, 2, "green", false)
                }
        );
        System.out.println(park);
        System.out.println(park.getDinosaurs()[2]);
        // хотим достать трицератопса
        // можем достать из объекта массив динозавров park.getDinosaurs()
        // а потом по индексу достать из этого массива нужный объект park.getDinosaurs()[2]
    }
}