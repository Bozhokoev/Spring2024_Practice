package codingbat.akim.warmup1;

public class Max1020 {
    public int max1020(int a, int b) {
        boolean aInRange = (a >= 10 && a <= 20);
        boolean bInRange = (b >= 10 && b <= 20);
        if (aInRange && bInRange) {
            return Math.max(a, b);
        }
        else if (aInRange) {
            return a;
        }
        else if (bInRange) {
            return b;
        }
        else {
            return 0;
        }
    }
}
