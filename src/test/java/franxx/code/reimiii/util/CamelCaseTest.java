package franxx.code.reimiii.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CamelCaseTest {
    @Test
    void testConvertToStringCamelCaseSuccess() {
        String input = "For well done";
        var result = StringCaseConverter.convertStringToCamelCase(input);

        Assertions.assertNotNull(input);
        Assertions.assertNotEquals(result, input);
        Assertions.assertEquals("forWellDone", result);
    }

    @Test
    void testConvertToStringCamelCaseFailedIsEmptyOrIsBlank() {
        String inputEmpty = "";
        String inputBlank = "    ";
        String inputNotValidString = "@#$$%^#@! not a valid string";

        Assertions.assertThrows(IllegalArgumentException.class, () -> StringCaseConverter.convertStringToCamelCase(inputBlank));

        Assertions.assertThrows(IllegalArgumentException.class, () -> StringCaseConverter.convertStringToCamelCase(inputEmpty));

        Assertions.assertThrows(IllegalArgumentException.class, () -> StringCaseConverter.convertStringToCamelCase(inputNotValidString));
    }
}
