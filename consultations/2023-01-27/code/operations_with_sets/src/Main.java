import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Frodo");
        names.add("Sam");
        names.add("Bilbo");
        names.add("Tuk");
        List<String> names2 = new ArrayList<>();
        names2.add("Frodo");
        names2.add("Sam");
        names2.add("Tuk");
        names2.add("Gimly");

        System.out.println(getIntersection(names, names2));


        // ниже про панд
        List<Panda> pandas1 = new ArrayList<>();
        pandas1.add(new Panda("John"));
        pandas1.add(new Panda("Phoma"));
        pandas1.add(new Panda("Anatoliy"));
        List<Panda> pandas2 = new ArrayList<>();
        pandas2.add(new Panda("Bob"));
        pandas2.add(new Panda("Phoma"));
        pandas2.add(new Panda("Anatoliy"));

        System.out.println(getDifference(pandas1, pandas2));
    }

    public static Set<Panda> getDifference(List<Panda> list1, List<Panda> list2){
        // list1 - list2
        Set<Panda> pandasResult = new HashSet<>();
        for(Panda panda: list1){
            if(!list2.contains(panda)){
               pandasResult.add(panda);
            }
        }
        return pandasResult;

    }

    public static HashSet<String> getIntersection(List<String> list1, List<String> list2){
        HashSet<String> result = new HashSet<>();
//        for (String name: list1){
//            if(list2.contains(name)){
//                result.add(name);
//            }
//        }
        Iterator<String> iterator = list1.iterator();
        String temp;
        while (iterator.hasNext()){
            if(list2.contains(temp = iterator.next())){
               result.add(temp);
            }
        }
        return result;
    }






}