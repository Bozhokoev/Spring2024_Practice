package codingbat.amir.string1;

public class Without2 {

    public String without2(String str) {

        if(str.length() < 2) {
            return str;
        }
        String firstTwo = str.substring(0,2);
        String lastTwo = str.substring(str.length() - 2);
        if(firstTwo.equals(lastTwo)) {
            return str.substring(2);
        }
        return str;
    }
}
