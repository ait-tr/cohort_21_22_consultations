import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {

    @Test
    void testM(){
        int[] arr = {1,2,3};
        int[] expectedArray={2,3,4};
        Main.m(arr);
        Assertions.assertArrayEquals(expectedArray,arr);

    }


}
