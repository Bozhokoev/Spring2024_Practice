package codingbat.janat.string1;

public class StartWord {
    public String startWord(String str, String word) {
        int wordLength = word.length();

        // Check if the length of the word is greater than the length of the string
        if (wordLength > str.length()) {
            return "";
        }

        // Extract the substring from s starting at index 1 and compare it with word excluding the first character
        String sSub = str.substring(1, wordLength);
        String wordSub = word.substring(1);

        if (sSub.equals(wordSub)) {
            return str.substring(0, wordLength);
        }

        return "";
    }
}
