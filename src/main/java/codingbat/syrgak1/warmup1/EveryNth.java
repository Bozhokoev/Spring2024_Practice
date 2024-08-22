package codingbat.syrgak1.warmup1;

public class EveryNth {
    public String everyNth(String str, int n) {
        String temp = "";
        for (int i = 0; i < str.length();i = i + n)
            temp += str.charAt(i);
        return temp;
    }
}
