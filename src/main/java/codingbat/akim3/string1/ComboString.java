package codingbat.akim3.string1;

public class ComboString {
    public String comboString(String a, String b) {
        if(a.length() > b.length()){
            return b+a+b;
        } return a+b+a;
    }
}
