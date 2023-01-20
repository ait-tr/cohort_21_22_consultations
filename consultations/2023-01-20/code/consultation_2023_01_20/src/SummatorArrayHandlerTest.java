import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SummatorArrayHandlerTest {
    @Test
    @DisplayName("{1,2,3,3,2,1} should return 12")
    public void sumTest(){
        // 1. исходные данные
        // 2. Вызываем метод
        // 3. сравнение

        int[] arr = {1,2,3,3,2,1};
        SummatorArrayHandler summatorArrayHandler = new SummatorArrayHandler();
        long res =summatorArrayHandler.handle(arr);
        Assertions.assertEquals(12, res);

    }
    @Test
    public  void  shouldThrowException(){
        SummatorArrayHandler summatorArrayHandler = new SummatorArrayHandler();
        Assertions.assertThrows(IllegalArgumentException.class, ()->summatorArrayHandler.handle(null)  );

        /*
        boolean flag = true;
        try {
            long res =summatorArrayHandler.handle(null);
        } catch (IllegalArgumentException e){
            flag=false;
        }
        Assertions.assertFalse(flag);
*/
    }

}
