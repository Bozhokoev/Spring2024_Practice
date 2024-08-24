package codingbat.akim4.string2;

public class BobThere {
    public boolean bobThere(String str) {
        for(int i = 0; i < str.length()-2; i++){
            if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b' && str.length() > 2){
                return true;
            }
        }return false;
    }
}
