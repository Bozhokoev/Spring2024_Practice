package codingbat.zarina3.string1;

public class LastTwo {
    public String lastTwo(String str) {

        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, str.length() - 2)
                + str.charAt(str.length() - 1)
                + str.charAt(str.length() - 2);
    }
}
