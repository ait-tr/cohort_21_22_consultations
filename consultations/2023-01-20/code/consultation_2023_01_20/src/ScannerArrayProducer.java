import java.util.Scanner;

public class ScannerArrayProducer implements ArrayProducer {
private Scanner scanner= new Scanner(System.in);
    @Override
    public int[] getArray() {
        return new int[0];
    }
}
