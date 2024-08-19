package codingbat.akbar.warmup1;

public class NearHundred {
    public boolean nearHundred(int n) {
        if((Math.abs(100 - n )<=10)){
            return true;
        }else if((Math.abs(200 - n) <=10 )){
            return true;
        }
        else{
            return false;
        }
    }
}
