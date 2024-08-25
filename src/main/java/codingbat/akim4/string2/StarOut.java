package codingbat.akim4.string2;

public class StarOut {
    public String starOut(String str) {
        int size = str.length();
        String final_word = "";
        for(int i = 0; i < size; i++){
            if(i == 0 && str.charAt(i) !='*'){
                final_word += str.charAt(i);
            } else if(i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*'){
                final_word += str.charAt(i);
            } else if(i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*'){
                final_word = final_word.substring(0, final_word.length()-1);
            }
        } return final_word;
    }
}
