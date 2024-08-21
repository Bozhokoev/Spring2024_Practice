package codingbat.dana.string1;

public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length() >1){
            return str.substring (0,2);
        }
        else {
            return str;
        }
    }
}
