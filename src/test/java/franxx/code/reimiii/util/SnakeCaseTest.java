package franxx.code.reimiii.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SnakeCaseTest {
    @Test
    void testConvertStringToSnakeCaseSuccess() {
        String input = "Hello World Myboy Okatss";
        var result = StringCaseConverter.convertStringToSnakeCase(input);

        Assertions.assertNotNull(input);
        Assertions.assertNotEquals(result, input);
        Assertions.assertEquals("hello_world_myboy_okatss", result);
    }

    @Test
    void testConvertToStringSnakeCaseFailedIsEmptyOrIsBlank() {
        String inputEmpty = "";
        String inputBlank = "    ";
        String inputNotValidString = "@#$$%^#@! not a valid string";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringCaseConverter.convertStringToSnakeCase(inputBlank);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringCaseConverter.convertStringToSnakeCase(inputEmpty);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringCaseConverter.convertStringToSnakeCase(inputNotValidString);
        });
    }
}
