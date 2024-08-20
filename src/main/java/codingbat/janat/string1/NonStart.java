package codingbat.janat.string1;

public class NonStart {
    public String nonStart(String a, String b) {
        if (a.length() >= 1 && b.length() >= 1 ){
            return a.substring(1) + b.substring(1);
        } return a + b;
    }

}
