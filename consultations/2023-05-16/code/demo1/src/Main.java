import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculator(10,20, new OperationImpl()));
        System.out.println(calculator(10, 20, new OperationImp2()));

        System.out.println(calculator(10,20, (n1,n2)-> n1+n2));
        System.out.println(calculator(10,20, (n1,n2)-> n1+n2/n1+n2));

        List<String> strings = List.of("qwet1", "jjjjsj", "jjjdjjwuuuw", "tyuiow");
        System.out.println(stringsHandler(strings, s -> s.startsWith("jjj")));
        System.out.println(stringsHandler(strings, s -> s.length()>5));
        System.out.println(stringsHandler(strings, s -> s.equals("jjjjsj")));

        strings.forEach(s-> System.out.println(s));

    }

    public static  int calculator(int a, int b, Operation oper) {
       return oper.calc(a, b);
    }

    public static List<String> stringsHandler(List<String> list, Predicate<String> condition){
        List<String> res= new ArrayList<>();
        for (String str:list){
            if(condition.test(str)){
                res.add(str);
            }
        }
        return res;
    }

    /*
    public static int apply(String str){
        return str.length();
    }
    public static Person apply(Account acc){
        return str.length();
    }

     */


}