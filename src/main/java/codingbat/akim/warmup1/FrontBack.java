package codingbat.akim.warmup1;

public class FrontBack {
    public String frontBack(String str) {
        if(str.length()>=2){
            String st1 =  str.substring(str.length() - 1);
            String st2 = str.substring (0,1);
            String middle = str.substring (1 , str.length()-1);
            return st1 + middle + st2;
        }return str;
    }
}
