package codingbat.amir.warmup1;

public class MissingChar {
    public String missingChar(String str, int n) {

        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;
    }
}
