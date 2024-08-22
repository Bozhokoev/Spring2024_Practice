package codingbat.janat.warmup1;

public class MissingChar {
    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder (str);
        return (sb.deleteCharAt(n).toString());
    }

}
