package codingbat.akim4.string2;

public class PlusOut {
    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < str.length()) {
            if (str.startsWith(word, index)) {
                result.append(word);
                index += word.length();
            } else {
                result.append("+");
                index++;
            }
        }return result.toString();
    }
}
