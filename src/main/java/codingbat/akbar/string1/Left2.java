package codingbat.akbar.string1;

public class Left2 {
    public String left2(String str) {
        String res = "";
        if(str.length() > 2){
            res+=str.substring(2);
            res+=str.substring(0,2);
            return res;
        }else{
            return str;
        }
    }
}
