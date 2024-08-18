package codingbat.akbar.warmup1;

public class MixStart {
    public boolean mixStart(String str) {
        if(str.length() > 2 && str.substring(1,3).equals("ix")){
            return true;
        }
        return false;
    }
}
