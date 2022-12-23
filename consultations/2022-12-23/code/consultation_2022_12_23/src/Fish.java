public class Fish extends Animal{
    private int numberOfFins;
    @Override
    public void move(){
        System.out.println("swim");
    }
    public int getNumberOfFins(){
        return numberOfFins;
    }

}
