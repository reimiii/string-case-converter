package franxx.code.reimiii.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCaseConverterTest {
    @Test
    void testConvertStringToSarcasmCaseSuccess() {
        String input = "Hello World";
        var result = StringCaseConverter.convertStringToSarcasmCase(input);

        Assertions.assertNotNull(input);
        Assertions.assertNotEquals(result, input);
        Assertions.assertEquals(result, result);
    }

    @Test
    void testConvertStringToSarcasmCaseFailedIsEmpty() {
        String input = "";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringCaseConverter.convertStringToSarcasmCase(input);
        });
    }
}
