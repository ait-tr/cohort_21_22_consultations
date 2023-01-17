import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
         // create list fro array
         String[] string = {"str1","str2", "str3"};
         List<String> list1 = Arrays.asList(string);

         //list1.add("add stroa"); // !!! Exception
         list1.set(0,"new str1");  // is ok

        List<String> list2 = new ArrayList<>(list1); // normal ArrayList

        // create copy of list
        List<String> list3 = new LinkedList<>(list2); // list3 is the copy of list2, but LinkedList

        // add all elements from one list to other
        list2.addAll(list3); // add all from list3 to list2

        // create new list and add elements
        List<String> qwe = List.of("qwe", "qwe18", "qwe2qwe");
        //qwe.add("qwe3"); // UnsupportedOperationException
        //qwe.set(0,"new qwe");


        //////////////////////////////
        List<Integer> list = new ArrayList<>(List.of(1,2,4,5,7,8,1,0,11));
        System.out.println(list);
        list.add(100);
        System.out.println(list);


    }



}


