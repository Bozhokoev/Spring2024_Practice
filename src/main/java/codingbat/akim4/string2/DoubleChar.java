package codingbat.akim4.string2;

public class DoubleChar {
    public String doubleChar(String str) {
        if(str.isEmpty()){
            return "";
        }
        String strWord = "";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            strWord += c;
            strWord += c;
        }return strWord;
    }
}
