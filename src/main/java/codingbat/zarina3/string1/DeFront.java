package codingbat.zarina3.string1;

public class DeFront {
    public String deFront(String str) {
        if (str.length() < 2) {
            return "";
        } else if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str;
        } else if (str.charAt(0) == 'a') {
            return str.charAt(0) + str.substring(2);
        } else if (str.charAt(1) == 'b') {
            return str.charAt(1) + str.substring(2);
        } else {
            return str.substring(2);
        }
    }
}
