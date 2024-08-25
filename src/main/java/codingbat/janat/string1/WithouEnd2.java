package codingbat.janat.string1;

public class WithouEnd2 {
    public String withouEnd2(String str) {
        if (str.length() > 1){
            return str.substring(1, str.length()- 1);
        } else if (str.length() == 0) {
            return str.substring(0);
        }return str.substring(1);
    }

}
