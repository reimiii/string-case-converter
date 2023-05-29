package franxx.code.reimiii.util;

public class StringCaseConverter {
    public static String convertStringToSarcasmCase(String inputString) {
        StringBuilder builder = new StringBuilder();

        if (inputString.isEmpty() || inputString.isBlank()) {
            throw new IllegalArgumentException("String cannot Empty or Blank");
        }

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
