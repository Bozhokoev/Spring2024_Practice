package codingbat.syrgak1.warmup1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        if (aTeen && !bTeen || !aTeen && bTeen){
            return true;
        }
        return false;
    }
}
