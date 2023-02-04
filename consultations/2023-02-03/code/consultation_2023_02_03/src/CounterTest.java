import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CounterTest {


    @Test
    public void countTest(){
        List<Person> people = List.of(
                new Person("Jack", 20),
                new Person("John", 20),
                new Person("Jack", 20),
                new Person("John", 32),
                new Person("Nick", 25)
        );

        Map<Person, Integer> expected = new HashMap<>();
        expected.put(new Person("Jack",20), 2);
        expected.put(new Person("John",20), 1);
        expected.put(new Person("John",32), 1);
        expected.put(new Person("Nick",25), 1);

        System.out.println(expected);

        Counter counter = new Counter(people);
        Map<Person, Integer> actualResult = counter.count();

        Assertions.assertEquals(expected, actualResult);


    }

}
