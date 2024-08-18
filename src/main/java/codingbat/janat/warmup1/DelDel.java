package codingbat.janat.warmup1;

public class DelDel {
    public String delDel(String str) {
        if (str.length() > 3){
            if (str.substring(1,4).equals("del")){
                return str.substring(0,1) + str.substring(4, str.length()-0);
            }
        }
        else{
            return str;
        }
        return str;
    }

}
