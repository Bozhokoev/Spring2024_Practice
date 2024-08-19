package codingbat.akim2.warmup2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        if(a.length() >=2 && b.length() >=2){
            for(int i = 0; i < a.length()-1 && i < b.length() -1 ; i++){
                if(a.substring(i, i+ 2).equals(b.substring(i, i+2))){
                    count++;
                }
            }
        } return count;
    }
}
