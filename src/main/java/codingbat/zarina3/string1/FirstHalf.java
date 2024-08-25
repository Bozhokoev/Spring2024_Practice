package codingbat.zarina3.string1;

public class FirstHalf {
    public String firstHalf(String str) {
        String str2 = "";
        if (str.length() % 2 == 0){
            str2 = str.substring (0, str.length()/2);
        }
        return str2;
    }
}
