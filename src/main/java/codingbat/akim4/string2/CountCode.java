package codingbat.akim4.string2;

public class CountCode {
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++){
            String s1 = str.substring(i, i+2);
            String s2 = str.substring (i+3, i + 4);
            if(s1.equals("co") && s2.equals("e")){
                count++;
            }
        } return count;
    }
}
