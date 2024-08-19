package codingbat.guldana_warmup1;

public class Diff21 {
    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
}
