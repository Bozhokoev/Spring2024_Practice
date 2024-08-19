package codingbat.akbar.warmup2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int  count = 0;
        int len = Math.min(a.length(),b.length());
        for(int i = 0; i < len-1; i++){
            //String as = a.substring(i,i+2);
            // String bs = b.substring(i,i+2);
            if(a.substring(i,i+2).equals(b.substring(i,i+2))){
                count++;
            }
        }

        return count;
    }
}
