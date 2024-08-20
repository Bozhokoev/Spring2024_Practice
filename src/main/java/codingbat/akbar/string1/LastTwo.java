package codingbat.akbar.string1;

public class LastTwo {
    public String lastTwo(String str) {
        if(str.length() >= 2){
            String prelast = str.substring(str.length()-2,str.length()-1);
            String last  = str.substring(str.length()-1);
            return str.substring(0,str.length()-2)+last+prelast;}
        else{
            return str;
        }
    }
}
