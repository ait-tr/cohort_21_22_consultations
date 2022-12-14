public class Main {
    public static void main(String[] args) {
       PlasticWaste bottle = new PlasticWaste();
       System.out.println(bottle);
       OrganicWaste apple = new OrganicWaste();
       System.out.println(apple);
       apple.use();
       OrganicWaste rottenTomato = new OrganicWaste(1, 1, true, 60);
       System.out.println(rottenTomato);
    }
}