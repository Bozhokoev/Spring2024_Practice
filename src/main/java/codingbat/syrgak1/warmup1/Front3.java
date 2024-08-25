package codingbat.syrgak1.warmup1;

public class Front3 {
    public String front3(String str) {
        String aya;
        if(str.length() >= 3){
            aya=str.substring(0,3);
        }
        else{
            aya = str;
        }
        return aya + aya + aya;
    }
}
