package franxx.code.reimiii.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCaseConverter {
    public static String convertStringToSarcasmCase(String inputString) {
        StringBuilder builder = new StringBuilder();

        try {
            isValidString(inputString);
            sarcasmCase(inputString, builder);
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid input: " + exception.getMessage());
            throw exception;
        }

        return builder.toString();
    }

    public static String convertStringToCamelCase(String inputString) {
        StringBuilder builder = new StringBuilder();

        try {
            isValidString(inputString);
            camelCase(inputString, builder);
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid input: " + exception.getMessage());
            throw exception;
        }

        return builder.toString();
    }

    public static String convertStringToSnakeCase(String inputString) {
        String toCamelCase = convertStringToCamelCase(inputString);
        String toSnakeCase = toCamelCase.replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();

        return toSnakeCase;
    }

    private static void sarcasmCase(String inputString, StringBuilder builder) {
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (i % 2 == 0) {
                builder.append(Character.toLowerCase(c));
            } else {
                builder.append(Character.toUpperCase(c));
            }
        }
    }

    private static void camelCase(String inputString, StringBuilder builder) {
        inputString = inputString.trim();

        String[] words = inputString.split("[\\s_-]+");

        builder.append(words[0].toLowerCase());

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            String caseWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            builder.append(caseWord);
        }
    }

    private static void isValidString(String inputString) {
        if (inputString.isEmpty()) {
            throw new IllegalArgumentException("String cannot Empty");
        }

        if (inputString.isBlank()) {
            throw new IllegalArgumentException("String cannot Blank");
        }

        if (!isValidRegex(inputString)) {
            throw new IllegalArgumentException("Text strings can only contain letters.");
        }
    }

    private static boolean isValidRegex(String text) {
        String pattern = "^[a-zA-Z\\s]+$";

        Pattern regexPattern = Pattern.compile(pattern);
        Matcher matcher = regexPattern.matcher(text);

        return matcher.matches();
    }
}
