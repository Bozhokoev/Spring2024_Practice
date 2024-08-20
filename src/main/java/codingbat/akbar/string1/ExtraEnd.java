package codingbat.akbar.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String res= "";
        if(str.length() >= 2){
            res = str.substring(str.length()-2);
        }
        return res+res+res;
    }
}
