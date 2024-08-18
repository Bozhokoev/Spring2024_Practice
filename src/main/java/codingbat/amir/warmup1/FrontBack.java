package codingbat.amir.warmup1;

public class FrontBack {
    public String frontBack(String str) {

        if (str == null || str.length() <= 1) {
            return str;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        return lastChar + str.substring(1, str.length() - 1) + firstChar;
    }
}
