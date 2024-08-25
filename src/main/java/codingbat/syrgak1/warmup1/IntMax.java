package codingbat.syrgak1.warmup1;

public class IntMax {
    public int intMax(int a, int b, int c) {
        if(a > b && a > c)
            return a;
        else if(b > c)
            return b;
        else return c;
    }
}
