package codingbat.janat.string1;

public class WithoutX {
    public String withoutX(String str) {
        if (str.length() < 2){
            return "";
        }
        if (str.startsWith("x") && str.endsWith("x")){
            return str.substring(1, str.length()-1);
        } else if ( str.endsWith("x")){
            return str.substring(0,str.length()-1);
        } else if (str.startsWith("x")){
            return str.substring(1);
        }
        return str;
    }

}
