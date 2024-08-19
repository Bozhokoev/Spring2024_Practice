package codingbat.vika.warmup2;

public class FrontTimes {

    public String frontTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (str.length() >= 3) {
                result.append(str.substring(0, 3));
            } else{
                result.append(str);
            }
        } return result.toString();
    }
}
