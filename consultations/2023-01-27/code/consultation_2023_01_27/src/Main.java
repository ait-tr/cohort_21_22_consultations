import java.util.*;

public class Main {
    public static void main(String[] args) {
//        FruitTree<String> stringTree = new FruitTree<>(29, 4, "Text");
        FruitTree<Orange,Soil> orangeTree = new FruitTree<>(
                29,
                4,
                new Orange("Orange"),
                new Soil("Chernozem")
                );
        HashMap<Integer, Integer> numbersByNumber = new HashMap<>();
        numbersByNumber.put(null, 9);

        Integer x;
        x = null;
        HashMap<FruitTree<Orange,Soil>, Integer> ratingsByTree = new HashMap<>();
        ratingsByTree.put(orangeTree, 18);
        ratingsByTree.put(new FruitTree<>(
                29,
                4,
                new Orange("Fig"),
                new Soil("Chernozem")
        ), 20);
        ratingsByTree.put(new FruitTree<>(
                29,
                4,
                new Orange("Fig"),
                new Soil("Chernozem")
        ), 20);
        System.out.println(ratingsByTree);
        System.out.println(new FruitTree<>(
                29,
                4,
                new Orange("Fig"),
                new Soil("Chernozem")
        ).hashCode());
        System.out.println(new FruitTree<>(
                29,
                4,
                new Orange("Fig"),
                new Soil("Chernozem")
        ).hashCode());

        HashSet<Lock> locksSet = new HashSet<>();
        locksSet.add(new Lock("Adamant", "steel"));
        locksSet.add(new Lock("QuickLock", "aloe"));
        locksSet.add(new Lock("QuickLock", "aloe"));

        System.out.println(locksSet);
        System.out.println(new Lock("QuickLock", "aloe").hashCode());
        System.out.println(new Lock("QuickLock", "aloe").hashCode());

        Iterator<Lock> locksItertor = locksSet.iterator();
        System.out.println(locksItertor.next());
        locksItertor.remove();
        System.out.println(locksItertor.next());
        if(locksItertor.hasNext()){
            System.out.println(locksItertor.next());
        }



    }
}