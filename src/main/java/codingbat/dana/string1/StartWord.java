package codingbat.dana.string1;

public class StartWord {

    public String startWord(String str, String word) {
        if(str.length() < word.length()){
            return "";
        }
        String subStr = str.substring(0, word.length());
        if(subStr.substring(1).equals(word.substring(1))){
            return subStr;
        } else{
            return "";
        }
    }
}
