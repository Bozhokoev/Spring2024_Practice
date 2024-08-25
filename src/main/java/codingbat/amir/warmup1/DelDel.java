package codingbat.amir.warmup1;

public class DelDel {

    public String delDel(String str) {

        if (str.length() < 1){
            return "";
        }
        else if (str.substring(1).startsWith("del")){
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }
}
