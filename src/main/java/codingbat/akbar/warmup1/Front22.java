package codingbat.akbar.warmup1;

public class Front22 {
    public String front22(String str) {
        if (str.length() >= 2){
            String first = str.substring(0,2);
            return first + str + first;
        }
        return str + str +str;
    }
}
