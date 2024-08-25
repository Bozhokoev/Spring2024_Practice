package codingbat.akbar.string1;

public class WithOutEnd2 {
    public String withouEnd2(String str) {
        if(str.length() > 1){
            return str.substring(1,str.length()-1);
        }else{
            return "";
        }
    }
}
