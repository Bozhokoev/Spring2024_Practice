package codingbat.jyldyzbek.warmup1;

public class StartHi {

    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        String first = str.substring(0, 2);
        if (first.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }
}
