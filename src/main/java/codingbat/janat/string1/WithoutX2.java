package codingbat.janat.string1;

public class WithoutX2 {
    public String withoutX2(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.length() == 1) {
            return str.equals("x") ? "" : str;
        }
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        boolean removeFirst = firstChar == 'x';
        boolean removeSecond = secondChar == 'x';

        StringBuilder result = new StringBuilder();

        if (!removeFirst) {
            result.append(firstChar);
        }
        if (!removeSecond) {
            result.append(secondChar);
        }

        if (str.length() > 2) {
            result.append(str.substring(2));
        }

        return result.toString();
    }

}
