package codingbat.akim4.string2;

public class MixString {
    public String mixString(String a, String b) {
        int min = Math.min(a.length(), b.length());
        int x = 0;
        String total = "";
        while (x < min){
            String wordA = a.substring(x, x+1);
            String wordB = b.substring(x, x+1);
            total = total + wordA + wordB;
            x++;
        }return total + a.substring(x) + b.substring(x);
    }
}
