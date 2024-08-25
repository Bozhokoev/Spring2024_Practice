package codingbat.akbar.string1;

public class FirstHalf {
    public String firstHalf(String str) {
        String sres = "";
        if(str.length() > 1 ){
            int res = str.length()/2;
            sres = str.substring(0,res);
        }
        return sres;
    }
}
