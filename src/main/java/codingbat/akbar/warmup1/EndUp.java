package codingbat.akbar.warmup1;

public class EndUp {
    public String endUp(String str) {
        if(str.length() < 3){
            return str.toUpperCase();
        }
        String res = str.substring(str.length()-3).toUpperCase();
        return str.substring(0,str.length()-3)+ res;
    }

}
