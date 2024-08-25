package codingbat.akbar.string1;

public class ExtraFront {
    public String extraFront(String str) {
        String res = "";
        if(str.length() > 1){
            res = str.substring(0,2);
            return res+ res + res;
        }
        else{
            return str+ str+ str;
        }
    }
}
