package codingbat.zarina3.string1;

public class MiddleThree {
    public String middleThree(String str) {
        int middle = str.length() / 2 - 1;
        return str.substring(middle, middle + 3);
    }
}
