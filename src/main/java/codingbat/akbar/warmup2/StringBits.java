package codingbat.akbar.warmup2;

public class StringBits {
    public String stringBits(String str) {
        String res = "";
        for(int i = 0; i < str.length(); i+=2){
            res += str.substring(i,i+1);
        }
        return res;
    }
}
