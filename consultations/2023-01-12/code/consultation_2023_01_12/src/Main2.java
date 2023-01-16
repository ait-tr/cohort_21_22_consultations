import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Jack1","Jack2",20));
        people.add(new Person("John1","John2",25));
        people.add(new Person("Nick1","Nick2",45));
        people.add(new Person("Klod1","Klod2",22));
        people.add(new Person("Ann1","Ann2",30));
        people.add(new Person("Nick11","Nick22",44));

        System.out.println(listPersonHandler(people, p->p.getAge()>30));
        System.out.println(listPersonHandler(people, p->p.getName1().equals("Jack1")));
        System.out.println(listPersonHandler(people, p -> p.getAge()<40, p->p.incAge()));



    }
    public static ArrayList<Person> listPersonHandler(ArrayList<Person> people, PersonPredicate predicate){
        ArrayList<Person> result = new ArrayList<>();
        for (Person p: people){
            if(predicate.test(p)){
                result.add(p);
            }
        }
        return result;
    }
    public static ArrayList<Person> listPersonHandler(ArrayList<Person> people, PersonPredicate predicate,PersonAction action){
        ArrayList<Person> result = new ArrayList<>();
        for (Person p: people){
            if(predicate.test(p)){
                action.action(p);
                result.add(p);
            }
        }
        return result;
    }

}
