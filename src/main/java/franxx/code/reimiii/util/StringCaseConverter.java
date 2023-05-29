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

    public static String convertStringToCamelCase(String inputString) {
        StringBuilder builder = new StringBuilder();

        inputString = inputString.trim();

        if (inputString.isEmpty() || inputString.isBlank()) {
            throw new IllegalArgumentException("String cannot Empty or Blank");
        }

        String[] words = inputString.split("[\\s_-]+");
        builder.append(words[0].toLowerCase());

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            String caseWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            builder.append(caseWord);
        }

        return builder.toString();
    }

    public static String convertStringToSnakeCase(String inputString) {
        String toCamelCase = convertStringToCamelCase(inputString);

        return toCamelCase.replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
    }
}
