package franxx.code.reimiii.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SarcasmCaseTest {
    @Test
    void testConvertStringToSarcasmCaseSuccess() {
        String input = "Hello World";
        var result = StringCaseConverter.convertStringToSarcasmCase(input);

        Assertions.assertNotNull(input);
        Assertions.assertNotEquals(result, input);
        Assertions.assertEquals("hElLo wOrLd", result);
    }

    @Test
    void testConvertStringToSarcasmCaseFailedIsEmptyOrIsBlank() {
        String inputEmpty = "";
        String inputBlank = "    ";
        String inputNotValidString = "@#$$%^#@! not a valid string";

        Assertions.assertThrows(IllegalArgumentException.class, () -> StringCaseConverter.convertStringToSarcasmCase(inputEmpty));

        Assertions.assertThrows(IllegalArgumentException.class, () -> StringCaseConverter.convertStringToSarcasmCase(inputBlank));

        Assertions.assertThrows(IllegalArgumentException.class, () -> StringCaseConverter.convertStringToSarcasmCase(inputNotValidString));
    }
}
