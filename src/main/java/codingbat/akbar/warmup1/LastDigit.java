package codingbat.akbar.warmup1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        int resa = a%10;
        int resb = b%10;
        if(resa==resb){
            return true;
        }
        return false;
    }
}
