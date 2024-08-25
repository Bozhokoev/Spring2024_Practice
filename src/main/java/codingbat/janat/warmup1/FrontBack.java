package codingbat.janat.warmup1;

public class FrontBack {

    public String frontBack(String str) {
        if (str.length()>=2){
            return str.substring(str.length() -1) + str.substring(1, str.length()-1) + str.substring(0,1);
        }return str;
    }

}
