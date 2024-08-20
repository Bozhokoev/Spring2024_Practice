package codingbat.akim3.string1;

public class FirstTwo {
    public String firstTwo(String str) {
        if(str.length()>=2){
            return str.substring(0,2);
        }
        return str;
    }
}
