package franxx.code.reimiii.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SnakeCaseTest {
    @Test
    void testConvertStringToSnakeCaseSuccess() {
        String input = "Hello World Myboy-Okatss";
        var result = StringCaseConverter.convertStringToSnakeCase(input);

        Assertions.assertNotNull(input);
        Assertions.assertNotEquals(result, input);
        Assertions.assertEquals("hello_world_myboy_okatss", result);
    }
}
