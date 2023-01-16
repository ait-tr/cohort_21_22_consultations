import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons1=new ArrayList<>();
        ArrayList<Person> persons2=new ArrayList<>();

        persons1.add(new Person("Jack"));
        persons1.add(new Person("John"));

        persons2.add(new Person("Ann"));
        persons2.add(new Person("Lena"));

        Group group1 = Group.getInstance(persons1);
        Group group2 = Group.getInstance(persons2);

        System.out.println(group1);
        System.out.println(group2);

    }

    public static void printHello(){
        System.out.println("hello");
    }
}