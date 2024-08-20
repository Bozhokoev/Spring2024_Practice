package codingbat.akim3.string1;

public class WithoutX2 {
    public String withoutX2(String str) {
        int len = str.length();
        String result = "";

        if(len > 0 && str.charAt(0) != 'x') {
            result = "" + str.charAt(0);
        } if(len > 1 && str.charAt(1) != 'x') {
            result = result + str.charAt(1);
        } if(len > 2){
            result = result + str.substring(2);
        }
        return result;
    }
}
