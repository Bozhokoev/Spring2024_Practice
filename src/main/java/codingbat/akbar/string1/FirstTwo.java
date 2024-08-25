package codingbat.akbar.string1;

public class FirstTwo {
    public String firstTwo(String str) {
        String res = "";
        if(str.length() >= 2 ){
            res = str.substring(0,2);
        }else{
            res = str;
        }
        return res;
    }
}
