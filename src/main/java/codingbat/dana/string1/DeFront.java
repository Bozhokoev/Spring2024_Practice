package codingbat.dana.string1;

public class DeFront {

    public String deFront(String str) {
        boolean firstCharA = (str.length() > 0 && str.charAt(0) == 'a');
        boolean secondCharB = (str.length() > 1 && str.charAt(1) == 'b');
        String result = "";
        if (firstCharA) {
            result += 'a';
        }
        if (secondCharB) {
            result += 'b';
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }
}
