package codingbat.janat.warmup1;

public class NearHundred {
    public boolean nearHundred(int n) {
        if ( Math.abs(100 - n) <= 10  || Math.abs(200 - n) <= 10){
            return true;
        } return false;
    }

}
