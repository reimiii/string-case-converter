package franxx.code.reimiii.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SarcasmCaseTest {
    @Test
    void testConvertStringToSarcasmCaseSuccess() {
        String input = "Hello World";
        var result = StringCaseConverter.convertStringToSarcasmCase(input);
        System.out.println(result);

        Assertions.assertNotNull(input);
        Assertions.assertNotEquals(result, input);
        Assertions.assertEquals("hElLo wOrLd", result);
    }

    @Test
    void testConvertStringToSarcasmCaseFailedIsEmptyOrIsBlank() {
        String inputEmpty = "";
        String inputBlank = "    ";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringCaseConverter.convertStringToSarcasmCase(inputEmpty);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringCaseConverter.convertStringToSarcasmCase(inputBlank);
        });
    }
}
