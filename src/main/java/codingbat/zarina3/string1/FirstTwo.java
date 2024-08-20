package codingbat.zarina3.string1;

public class FirstTwo {
    public String firstTwo(String str) {
        String result = "";
        if (str.length() <= 2)  result = str;
        else
            result = str.substring(0, 2);
        return result;
    }
}
