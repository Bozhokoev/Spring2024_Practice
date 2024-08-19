package codingbat.amir.warmup1;

public class Diff21 {
    public static int diff21(int n) {
        int difference = Math.abs(n - 21); // находим разницу между n и 21

        if (n > 21) {
            return 2 * difference;
        } else {
            return difference;
        }
    }
}
