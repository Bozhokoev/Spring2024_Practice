package codingbat.akbar.warmup1;

public class BackAround {
    public String backAround(String str) {
        String lastchar =str.substring(str.length()-1);
        return lastchar + str + lastchar;
    }
}
