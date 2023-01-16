import java.util.ArrayList;

public class Group {
    private static Group instance = null;
    private ArrayList<Person> list = new ArrayList<>();

    private Group(ArrayList<Person> list) {
        this.list = list;
    }

    public static Group getInstance(ArrayList<Person> list){
        if(instance==null){
            instance=new Group(list);
        };
        return instance;
    }

    @Override
    public String toString() {
        return "Group{" +
                "list=" + list +
                '}';
    }
}
