package codingbat.dana.string1;

public class Left2 {

    public String left2(String str) {
        String left = str.substring(0,2);
        String left2 = str.substring(2);
        return left2 + left;
    }
}
