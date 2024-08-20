package codingbat.akim3.string1;

public class MakeTags {
    public String makeTags(String tag, String word) {
        return "<"+ tag + ">" + word + '<' + '/' + tag + '>';
    }
}
