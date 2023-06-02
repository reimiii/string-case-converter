package franxx.code.reimiii;

import franxx.code.reimiii.util.StringCaseConverter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        var input = "Shadow Lady Portwave";

        var toCamelCase = StringCaseConverter.convertStringToCamelCase(input);
        var toSnakeCase = StringCaseConverter.convertStringToSnakeCase(input);
        var toSarcasmCase = StringCaseConverter.convertStringToSarcasmCase(input);

        System.out.println("Original input: " + input + "\n");

        System.out.println("camelCase: " + toCamelCase);
        System.out.println("snake_case: " + toSnakeCase);
        System.out.println("sArCaSm CaSe: " + toSarcasmCase);
    }
}
