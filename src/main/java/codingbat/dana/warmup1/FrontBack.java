package codingbat.dana.warmup1;

public class FrontBack {
    public String frontBack(String str) {
        if (str.length() >= 2){
            String lastChar = str.substring (str.length()-1);
            String firstChar = str.substring (0,1);
            String middle = str.substring (1, str.length()-1);
            return lastChar + middle + firstChar;
        }
        return str;
    }
}
