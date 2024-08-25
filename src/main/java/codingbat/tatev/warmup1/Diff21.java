package codingbat.tatev.warmup1;

public class Diff21 {
    public int diff21(int n) {

        int sum = n - 21;
        if (n < 21) {
            return 21 - n;
        }
        if (n >= 21) {
            return (n - 21) * 2;
        } else {
            return 0;
        }
    }
}
