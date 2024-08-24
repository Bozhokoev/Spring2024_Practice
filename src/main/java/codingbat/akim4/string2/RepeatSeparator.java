package codingbat.akim4.string2;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        String str = "";
        for(int i = 0; i < count; i++){
            if(i < count - 1){
                str += word + sep;
            } else{
                str += word;
            }
        }return str;
    }
}
