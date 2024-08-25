package codingbat.janat.string1;

public class MinCat {
    public String minCat(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();

        int minLength = Math.min(len1, len2);

        String truncatedStr1 = len1 > len2 ? a.substring(len1 - minLength) : a;
        String truncatedStr2 = len2 > len1 ? b.substring(len2 - minLength) : b;

        return truncatedStr1 + truncatedStr2;
    }

}
