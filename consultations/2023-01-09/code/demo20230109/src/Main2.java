import java.util.ArrayList;

public class Main2 {
    /*
        Написать метод который определяет, есть ли в заданном листе целых чисе число равное
        сумме двух предыдущих

     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add(1);

        System.out.println(checkList(list));
    }

    public static boolean checkList(ArrayList<Integer> list){
        if(list.size()<3) return false;

        for (int i = 2; i < list.size() ; i++) {
            if ( list.get(i)==list.get(i-1)+list.get(i-2)){
                return true;
            }
        }
        return false;

    }

}
