import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> moodsByNames = new HashMap<>();
        moodsByNames.put("Evgeniy", "grey");
        moodsByNames.put("Alisher", "blue");
        moodsByNames.put("Alex", "yellow");
        moodsByNames.put("Alex", "white");
        System.out.println("Evgeniy".hashCode()%16);
        System.out.println("Evgeniy".hashCode()&15);
        System.out.println(moodsByNames);
        System.out.println(moodsByNames.size());
        System.out.println(moodsByNames.get("Evgeniyy"));

        moodsByNames.put(null, "black night");
        System.out.println(moodsByNames);
        System.out.println(moodsByNames.get(null));

        moodsByNames.put("Michail", null);
        System.out.println(moodsByNames.get("Michail"));

        moodsByNames.putIfAbsent("Michail", "Green");

        moodsByNames.putIfAbsent("Alex", "Green");
        moodsByNames.putIfAbsent("Vano", "Orange");
        System.out.println(moodsByNames);
        System.out.println(moodsByNames.keySet());
        System.out.println(moodsByNames.values());
        System.out.println(moodsByNames.entrySet());

        //
        //           capacity * 0.75 < size --> увеличиваем




    }
}