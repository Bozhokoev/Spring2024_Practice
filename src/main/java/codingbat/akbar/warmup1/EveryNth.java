package codingbat.akbar.warmup1;

public class EveryNth {
    public String everyNth(String str, int n) {
        String res = "";
        for(int i = 0; i < str.length(); i+=n){
            res += str.substring(i,i+1);

        }
        return res;
    }

}
