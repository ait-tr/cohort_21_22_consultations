public class Printer <T extends Fruit> {

    boolean isDrunk; // false
    Boolean isHappy; // null

    T value;
    public void print(){
        System.out.println(value);
        value.toJam();

    }
    public Printer(T value){
        this.value = value;

    }


}
