package codingbat.zarina1.warmup1;

public class Close10 {
    public int close10(int a, int b) {
        int a1 = Math.abs(a - 10);
        int b1 = Math.abs(b - 10);

        if (a1 < b1) {
            return a;
        }
        if (b1 < a1) {
            return b;
        }
        return 0;
    }

}
