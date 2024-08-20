package codingbat.akim3.string1;

public class WithoutEnd {
    public String withoutEnd(String str) {
        if(str.length() > 0){
            return str.substring(1, str.length()-1);
        }
        return str;
    }
}
