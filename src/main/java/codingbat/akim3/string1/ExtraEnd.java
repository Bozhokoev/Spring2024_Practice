package codingbat.akim3.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        if(str.length() > 2){
            return str.substring(str.length() -2, str.length()) + str.substring(str.length() -2, str.length()) + str.substring(str.length() -2, str.length());
        } else{
            return str+str+str;
        }
    }
}
