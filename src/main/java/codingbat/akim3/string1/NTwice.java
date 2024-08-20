package codingbat.akim3.string1;

public class NTwice {
    public String nTwice(String str, int n) {
        String word = str.substring(0, n);
        String word2 = str.substring(str.length() - n);
        return word + word2;
    }
}
