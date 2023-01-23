import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList birds = new ArrayList();
        birds.add("Eagle");
        birds.add("Raven");
//        birds.add(12);

        String str = (String) birds.get(0);
        str = str.toUpperCase();

        if(birds.get(1) instanceof String){
            String str2 = (String) birds.get(1);
            str2 = str2.toUpperCase();
        } else {
            System.out.println("Приветик, а я не стринг! Нежданчик!");
        }

//        Printer<Boolean> printer1 = new Printer<>(true); // этот код больше не работает, потому что мы сделали extends Fruit
//        printer1.print();
        Printer<Cherry> cherryPrinter = new Printer<>(new Cherry("Вишенка", "бордовый"));
        cherryPrinter.print();

        String input = "12jdkld";
        try {
            int result;
            result = Integer.parseInt(input);
            System.out.println(result);

        } catch (NumberFormatException e){
            e.printStackTrace();
        }
//        int result2 = Integer.valueOf(input);

    }
}