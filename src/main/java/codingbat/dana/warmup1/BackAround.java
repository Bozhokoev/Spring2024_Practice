package codingbat.dana.warmup1;

public class BackAround {
    public String backAround(String str) {
        String st = str.substring(str.length() -1);
        return st + str + st;
    }
}
