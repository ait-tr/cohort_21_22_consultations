public class Panda {
    public String name;
    public double weight;
    public static final int numberOfColors = 2;
    public static int pandasPopulation;
    public int x = 10;

    public Panda(String name, double weight) {
        this.name = name;
        this.weight = weight;
        pandasPopulation++;
    }
    public void introduce(){
        System.out.println("Hello, dear Sir, my name is "+ name);
    }

    public static void introduce(Panda p){
        System.out.println("Static Hello, dear Sir, my name is "+ p.name);
        System.out.println(p.x);
    }

}
