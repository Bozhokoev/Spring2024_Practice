package codingbat.zarina3.string1;

public class HasBad {

    public boolean hasBad(String str) {
        if (str.length() <= 3 && !str.equals("bad")) {
            return false;
        } else if (str.substring(0, 3).equals("bad") || (str.substring(0, 4).contains("bad"))) {
            return true;
        } else return false;
    }
}
