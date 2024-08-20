package codingbat.akim3.string1;

public class Left2 {
    public String left2(String str) {
        if(str.length() > 2){
            return str.substring(2).concat(str.substring(0, 2));
        } return str;
    }
}
