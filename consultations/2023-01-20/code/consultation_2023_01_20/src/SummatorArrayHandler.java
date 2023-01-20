public class SummatorArrayHandler implements ArrayHandler{
    @Override
    public long handle(int[] array) throws IllegalArgumentException {
        if (array==null) throw new IllegalArgumentException();
        long sum=0;
        for (int element:array){
            sum+=element;
        }
        return sum;
    }
}
