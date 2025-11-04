import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

public class InputValidatorTest {

    @Test
    void testInvalidThenValidInt() {
        // "abc" is invalid, then "10" is valid
        Scanner fakeInput = new Scanner("abc\n1221");
        InputValidator validator = new InputValidator(fakeInput);

        int result = validator.getValidInt();
        assertEquals(1221, result);
        System.out.println(result);

    }

    @Test
    void testInvalidThenValidDouble(){
        Scanner fakeInput = new Scanner("abc\n1221.2231");
        InputValidator validator = new InputValidator(fakeInput);

        double result = validator.getValidDouble();
        assertEquals(1221.2231, result);
        System.out.println(result);

    }
}