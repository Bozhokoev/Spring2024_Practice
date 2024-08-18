package codingbat.zarina.warmup1;

public class BackAround {
    public String backAround(String str) {
        String sb = str.substring(str.length() - 1);
        return sb+str+sb;
    }
}
