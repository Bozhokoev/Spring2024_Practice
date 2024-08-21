package codingbat.dana.string1;

public class MinCat {

    public String minCat(String a, String b) {
        int len = (a.length() < b.length()) ? a.length() : b.length();
        if (a. length() != b.length()){
            return a.substring(a.length() - len) + b.substring(b.length() - len);
        } else {
            return a + b;
        }
    }
}
