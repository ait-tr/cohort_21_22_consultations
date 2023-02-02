
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Test 1. Frodo, Sam, Tuk")
    void getIntersection(){
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

        HashSet<String> actualResult = Main.getIntersection(names, names2);
        HashSet<String> expectedResult = new HashSet<>(Set.of("Frodo", "Sam", "Tuk"));
        Assertions.assertEquals(expectedResult, actualResult);
    }
}