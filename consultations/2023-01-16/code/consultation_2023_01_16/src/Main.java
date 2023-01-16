public class Main {
    public static void main(String[] args) {
        System.out.println(getStringHello());
    }
    public static String getStringHello(){
        return "Hello world!";
    }

    public static void m(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            arr[i]= arr[i]+1;
        }
    }



}