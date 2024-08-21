package codingbat.dana.string1;

public class NTwice {

    public String nTwice(String str, int n) {
        String firstChar = str.substring(0, n);
        String lastChar = str.substring (str.length() - n);
        return firstChar + lastChar;
    }
}
