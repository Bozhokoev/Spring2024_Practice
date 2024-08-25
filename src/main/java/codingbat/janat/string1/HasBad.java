package codingbat.janat.string1;

public class HasBad {
    public boolean hasBad(String str) {
        return str.startsWith("bad") || (str.length() > 1 && str.substring(1).startsWith("bad"));
    }
}
