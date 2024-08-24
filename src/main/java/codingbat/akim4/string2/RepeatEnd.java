package codingbat.akim4.string2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        int len = str.length();
        String word = str.substring(len - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++){
            result.append(word);
        }
        return result.toString();
    }
}
