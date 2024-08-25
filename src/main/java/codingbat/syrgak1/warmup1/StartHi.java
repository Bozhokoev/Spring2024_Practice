package codingbat.syrgak1.warmup1;

public class StartHi {
    public boolean startHi(String str) {
        if (str.length() < 2){
            return false;
        }
        String one1 = str.substring(0,2);
        if (one1.equals("hi")){
            return true;
        }
        else{
            return false;
        }
    }
}
