package codingbat.zarina1.warmup1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
            return false;
        } else if (a == b) {
            return false;
        }
        return true;
    }

}
