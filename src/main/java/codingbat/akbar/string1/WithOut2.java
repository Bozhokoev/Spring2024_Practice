package codingbat.akbar.string1;

public class WithOut2 {
    public String without2(String str) {
        String res = "";
        if (str.length() == 1) {
            return str;
        }
        if (str.length() < 2) {
            return "";
        } else if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            res = str.substring(2);
            return res;
        } else {
            return str;
        }
    }
}
