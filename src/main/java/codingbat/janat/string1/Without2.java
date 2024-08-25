package codingbat.janat.string1;

public class Without2 {
    public String without2(String str) {
        if (str.length() < 2 ) {
            return str;
        }
        String startSubstring = str.substring(0, 2);
        String endSubstring = str.substring(str.length() - 2);
        if (startSubstring.equals(endSubstring)){
            return str.substring(2);
        } return str;
    }

}
