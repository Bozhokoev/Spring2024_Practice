package codingbat.syrgak1.warmup1;

public class DelDel {
    public String delDel(String str) {
        return (str.length()>1 && str.substring(1).
                startsWith("del"))?str.replace("del",""):str;
    }
}
