package codingbat.janat.warmup1;

public class BackAround {
    public String backAround(String str) {
        if (str.length()>=1){
            return str.substring(str.length()-1) + str + str.substring(str.length()-1);
        } return str;
    }
}
