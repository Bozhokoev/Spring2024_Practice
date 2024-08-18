package codingbat.akim.warmup1;

public class IntMax {
    public int intMax(int a, int b, int c) {
        int max = a; // Предполагаем, что наибольшее значение - это a
        if (b > max) {
            max = b; // Если b больше, чем текущее максимальное значение, присваиваем max значение b
        }
        if (c > max) {
            max = c; // Если c больше, чем текущее максимальное значение, присваиваем max значение c
        }
        return max; // Возвращаем наибольшее значение
    }
}
