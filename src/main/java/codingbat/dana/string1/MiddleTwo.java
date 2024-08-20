package codingbat.dana.string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        int middleIndex = str.length() / 2 -1;
        return str.substring(middleIndex, middleIndex +2);
    }
}
