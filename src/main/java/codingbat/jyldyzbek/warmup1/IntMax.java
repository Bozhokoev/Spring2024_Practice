package codingbat.jyldyzbek.warmup1;

public class IntMax {

    public int intMax(int a, int b, int c) {
        int num;
        if (a > b) {
            num = a;
        } else {
            num = b;
        }
        if (c > num) {
            num = c;
        }
        return num;
    }

}
