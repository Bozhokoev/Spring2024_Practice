package codingbat.akim4.string2;

public class XyzThere {
    public boolean xyzThere(String str) {
        if (str.length() < 3){
            return false;
        }
        if(str.indexOf("xyz") == 0) {
            return true;
        }
        for ( int i = 1; i < str.length() - 2; i++){
            String word = str.substring(i, i+3);
            if(word.equals("xyz") && str.charAt(i-1) != '.')
                return true;
        }return false;
    }
}
