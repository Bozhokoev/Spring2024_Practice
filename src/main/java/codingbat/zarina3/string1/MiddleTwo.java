package codingbat.zarina3.string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        if (str.length() % 2 == 0) {
            int middle = str.length() / 2 - 1;
            return str.substring(middle, middle + 2);
        }
        return str;
    }
}
