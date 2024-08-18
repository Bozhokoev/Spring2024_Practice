package codingbat.akim.warmup1;

public class EndUp {
    public String endUp(String str) {
        if(str.length()>3){
            return str.substring(0, str.length() - 3) + str.substring(str.length()-3).toUpperCase();
        }
        return str.toUpperCase();
    }
}
