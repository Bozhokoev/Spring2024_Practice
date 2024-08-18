package codingbat.janat.warmup1;

public class Front22 {
    public String front22(String str) {

        if (str.length() >= 2){
            String str2 = str.substring(0,2);
            return str2 + str + str2;
        }
        if (str.length() < 2){
            return str + str + str;
        }
        return str;
    }
}
