package codingbat.khantenir.warmup1;

public class Diff21 {
    public int diff21(int n) {
        int s = Math.abs(n- 21);
        if (n > 21){
            return s * 2;
        }
        return s;
    }

}
