package codingbat.akim2.warmup2;

public class Last2 {
    public int last2(String str) {
        int count = 0;
        if(str.length() > 2){
            String lastString = str.substring(str.length()-2);
            for(int i =0; i < str.length()-2; i++){
                if(str.substring(i, i+2).equals(lastString))
                    count++;
            }
        }return count;
    }
}
