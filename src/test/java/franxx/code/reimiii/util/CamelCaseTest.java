package franxx.code.reimiii.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CamelCaseTest {
    @Test
    void testConvertToStringCamelCaseSuccess() {
        String input = "for well-done_documented   args";
        var result = StringCaseConverter.convertStringToCamelCase(input);

        Assertions.assertNotNull(input);
        Assertions.assertNotEquals(result, input);
        Assertions.assertEquals("forWellDoneDocumentedArgs", result);
    }

    @Test
    void testConvertToStringCamelCaseFailedIsEmptyOrIsBlank() {
        String inputEmpty = "";
        String inputBlank = "    ";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringCaseConverter.convertStringToCamelCase(inputBlank);
            StringCaseConverter.convertStringToCamelCase(inputEmpty);
        });
    }
}
