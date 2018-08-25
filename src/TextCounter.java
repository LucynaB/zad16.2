public class TextCounter {

    public static int countChars(String text) {
        return text.length();
    }

    public static int countCharsWithoutSpaces(String text) {
        String textWithoutSpaces = text.replace(" ", "");
        return textWithoutSpaces.length();
    }


    public static int countWords(String text) {
        String[] tab = text.split(" ");
        return tab.length;
    }

    public static boolean checkPalindrome(String text) {
        String textWithoutSpaces = text.replace(" ", "").toLowerCase();

        for (int i = 0; i < textWithoutSpaces.length(); i++) {
            if (textWithoutSpaces.charAt(i) != textWithoutSpaces.charAt(textWithoutSpaces.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
