package codingbat.akbar.warmup1;

public class IoneTeen {public boolean loneTeen(int a, int b) {
    boolean Aint = (a >= 13 && a <= 19);
    boolean Bint = (b >= 13 && b <= 19);
    return   ( Aint & !Bint) || ( !Aint && Bint);
}
}
