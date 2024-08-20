package codingbat.akbar.string1;

public class WithOutX {
    public String withoutX(String str) {
        String res = str;
        if(str == "x"){
            return "";
        }
        if(str.length() > 1){
            if(res.charAt(0)=='x'){
                res = res.substring(1);
            }
            if(res.charAt(res.length()-1) == 'x'){
                res = res.substring(0,res.length()-1);
            }}
        return res;
    }
}
