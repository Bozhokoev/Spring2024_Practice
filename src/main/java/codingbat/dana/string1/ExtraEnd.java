package codingbat.dana.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String st = str.substring(str.length() - 2);
        return st + st + st;
    }
}
