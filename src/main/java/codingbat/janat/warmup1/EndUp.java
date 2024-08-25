package codingbat.janat.warmup1;

public class EndUp {
    public String endUp(String str) {

        if (str.length() >= 3){
            String str1 = str.substring(0, str.length() - 3);
            String str2 = str.substring(str.length() - 3);
            return str1 + str2.toUpperCase();
        }
        if (str.length() <= 2) {
            return str.toUpperCase();

        }
        return str;
    }
}
