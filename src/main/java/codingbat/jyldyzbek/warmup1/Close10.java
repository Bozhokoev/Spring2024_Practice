package codingbat.jyldyzbek.warmup1;

public class Close10 {

    public int close10(int a, int b) {
        int count = Math.abs(a - 10);
        int count1 = Math.abs(b - 10);

        if (count < count1) {
            return a;
        }
        if (count1 < count) {
            return b;
        }
        return 0;
    }

}
