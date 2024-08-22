package codingbat.zarina1.warmup1;

public class MixStart {
    public boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }

}
