package codingbat.akbar.warmup1;

public class FrontBack {
    public String frontBack(String str) {
        if(str.length() >= 2){
            String lastchar = str.substring(str.length()-1);
            String firstchar = str.substring(0,1);
            String middle = str.substring(1, str.length()-1);
            return lastchar + middle + firstchar;
        }
        return str;
    }
}
