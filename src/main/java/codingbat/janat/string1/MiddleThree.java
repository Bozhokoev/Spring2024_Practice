package codingbat.janat.string1;

public class MiddleThree {
    public String middleThree(String str) {
        int middleThree = str.length() / 2;
        // String middle2 = str.substring(middle, middle +)
        return str.substring(middleThree - 1, middleThree + 2);
    }

}
