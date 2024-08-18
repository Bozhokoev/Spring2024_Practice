package codingbat.akim.warmup1;

public class StartOz {
    public String startOz(String str) {
        if (str.length() == 0) {
            return "";
        }
        if(str.startsWith("oz") && str.length() > 0){
            return "oz";
        } else if (str.startsWith("o") && str.length() > 0){
            return "o";
        } else if(str.substring(1,2).equals("z") && str.length()>0){
            return str.substring(1, 2);
        } return   "";
    }
}
