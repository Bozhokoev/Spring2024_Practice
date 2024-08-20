package codingbat.dana.string1;

public class FirstHalf {
    public String firstHalf(String str) {
        int middle = str.length()/2;
        return str.substring(0, middle);
    }
}
