import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {


        PriorityQueue<String> queue = new PriorityQueue<>();
        Object[] objects={"str1","hstr2",2,null};


        for (int i =0; i<objects.length;i++) {
            try {
                addValue(queue, objects[i]);
            } catch (ClassCastException e) {
                System.out.println("Ошибка добавления "+ i+ " записи. Значение "+objects[i] + " не строка!" );
            } catch (NullPointerException e){
                System.out.println("Ошибка добавления "+ i+ " записи. Значение "+objects[i] + " не может быть добавлено" );
            } catch (StartWithHStringException e){
                System.out.println("AAAA!!!!! Строка началась c 'h'");
            }
        }
        System.out.println(queue);
    }

    public static void addValue(PriorityQueue<String> queue, Object obj) throws StartWithHStringException {

            String s = (String)obj;
            if(s.startsWith("h")) throw new StartWithHStringException();
            queue.add(s);
            System.out.println("Операция выполлнена успешно!");
    }
}