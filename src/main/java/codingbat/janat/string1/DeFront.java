package codingbat.janat.string1;

public class DeFront {
    public String deFront(String str) {
        if (str.length() < 2) {
            return str.equals("a") || str.equals("b") ? str : "";
        }

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        boolean keepFirstChar = firstChar == 'a';
        boolean keepSecondChar = secondChar == 'b';

        StringBuilder result = new StringBuilder();
        if (keepFirstChar) {
            result.append(firstChar);
        }
        if (keepSecondChar) {
            result.append(secondChar);
        }
        if (str.length() > 2) {
            result.append(str.substring(2));
        }

        return result.toString();
    }

}
