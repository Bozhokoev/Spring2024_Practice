package codingbat.akbar.string1;

public class Right2 {
    public String right2(String str) {
        String res = "";
        if(str.length() > 2 ){
            res = str.substring(str.length()-2);
            res += str.substring(0,str.length()-2);
            return res;
        }
        else{
            return str;
        }
    }
}
