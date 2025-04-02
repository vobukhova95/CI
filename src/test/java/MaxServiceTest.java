import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.MaxService;

public class MaxServiceTest {

    @Test

    public void shouldFindMax () {
        MaxService service = new MaxService();
        int a = 5;
        int b = 7;
        int expected = a;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);


    }
}
