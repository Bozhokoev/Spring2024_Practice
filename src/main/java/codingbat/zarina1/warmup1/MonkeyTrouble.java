package codingbat.zarina1.warmup1;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile){
            return true;
        }
        if (!aSmile &&!bSmile){
            return true;
        }else{
            return false;
        }
    }
}
