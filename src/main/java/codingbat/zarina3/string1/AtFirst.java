package codingbat.zarina3.string1;

public class AtFirst {
    public String atFirst(String str) {
        if (str.length() == 1) {
            return str.substring(0, 1) + "@";
        } else if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        return "@@";
    }
}
