package codingbat.akbar.warmup2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String res = "";
        if(str.length() >= 3){

            for(int i = 0; i < n; i++){
                res+= str.substring(0,3);
            }}else if(str.length() < 3){
            for(int j = 0; j < n; j++){
                res+= str.substring(0,str.length());
            }}
        return res;
    }
}
