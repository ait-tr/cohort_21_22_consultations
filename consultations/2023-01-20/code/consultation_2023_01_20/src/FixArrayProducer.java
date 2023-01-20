public class FixArrayProducer implements ArrayProducer{

    @Override
    public int[] getArray() {
        int[] array= new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        return array;
    }
}
