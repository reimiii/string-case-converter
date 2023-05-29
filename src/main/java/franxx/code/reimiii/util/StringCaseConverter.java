package franxx.code.reimiii.util;

public class StringCaseConverter {
    public static String convertStringToSarcasmCase(String inputString) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (i % 2 == 0) {
                builder.append(Character.toLowerCase(c));
            } else {
                builder.append(Character.toUpperCase(c));
            }

        }

        return builder.toString();
    }
}
