package codingbat.akbar.string1;

public class WithOutX2 {
    public String withoutX2(String str) {
        int len = str.length();
        String result = "";

        if (len >= 1 && str.charAt(0) != 'x') {
            result += str.charAt(0);
        }
        if (len >= 2 && str.charAt(1) != 'x') {
            result += str.charAt(1);
        }
        if (len > 2) {
            result += str.substring(2);
        }

        return result;
    }
}
