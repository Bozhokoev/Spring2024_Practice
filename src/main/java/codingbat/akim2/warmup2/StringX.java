package codingbat.akim2.warmup2;

public class StringX {
    public String stringX(String str) {
        String word = "";
        for(int i = 0; i < str.length(); i++){
            if(!(i>0 && i < str.length()-1 && str.charAt(i) == 'x')){
                word += str.charAt(i);
            }
        } return word;
    }
}
