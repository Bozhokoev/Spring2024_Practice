package codingbat.amir.string1;

public class MinCat {

    public String minCat(String a, String b) {

    int lengthA = a.length();
    int lengthB = b.length();

    int minLength = Math.min(lengthA, lengthB);

    String asub = a.substring(lengthA - minLength);
    String bsub = b.substring(lengthB - minLength);

    return asub + bsub;
    }
}
