package codingbat.akim4.string2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String word = "";
        for (int i = n; i > 0; i--){
            word += str.substring(0, i);
        }
        return word;
    }
}
