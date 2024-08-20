package codingbat.dana.string1;

public class Right2 {
    public String right2(String str) {
        int len = str.length();
        String right = str.substring (len -2);
        String right2 = str.substring (0, len -2);
        return right + right2;
    }
}
