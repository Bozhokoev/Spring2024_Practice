package codingbat.dana.string1;

public class ComboString {

    public String comboString(String a, String b) {
        return (a.length() > b.length()) ?  b + a + b : a + b +a;
    }
}
