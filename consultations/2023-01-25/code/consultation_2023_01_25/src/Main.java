import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Material> materials = new HashSet<>();
        materials.add(new Material("concrete", 1200, "concrete is a good material"));
        materials.add(new Material("plank", 400, "plank is a universally good material"));
        System.out.println(materials);
        materials.add(new Material("plank", 400, "plank is a universally good material"));
        System.out.println(materials);
//        materials.clear();  // удаляет все элементы из коллекции
        System.out.println(materials.contains(new Material("concrete", 1200, "concrete is a good material")));
        System.out.println(materials);

        Iterator<Material> iterator = materials.iterator();
        iterator.next();
        System.out.println(iterator.next());
        if(iterator.hasNext()){
            iterator.next();
        }

        System.out.println("*".repeat(10));
        // пройтись циклом while

        Iterator<Material> iterator1 = materials.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("*".repeat(10));
        // remove
        Iterator<Material> iterator2 = materials.iterator();
        while(iterator2.hasNext()){
            if ("plank".equals(iterator2.next().title)){
                iterator2.remove();
                break; // если написали break- то он выйдет из цикла, а значит удалится только один элемент
                // если не напишет брейк - удалит все объекты подходящие под условие
            };

        }
        System.out.println(materials);

        Laughable john = new Laughable() {
            final int height = 29;
            @Override
            public void laugh() {
                System.out.println("I'm John, I like to laugh");
            }
        };
        john.laugh();

        Material.Tools.print();



    }
}