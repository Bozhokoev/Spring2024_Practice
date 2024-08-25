package codingbat.dana.string1;

public class WithoutX {

    public String withoutX(String str) {
        if(str.length() == 0){
            return str;
        }
        if(str.startsWith("x")){
            str = str.substring(1);
        } if (str.endsWith("x")){
            return str.substring(0, str.length()-1);
        } else {
            return str;
        }
    }
}
