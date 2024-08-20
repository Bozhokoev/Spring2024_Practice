package codingbat.asylzat.wapmup1;

public class NearHundred {
    public boolean nearHundred(int n) {
        return ((Math.abs(100-n)<= 10) ||(Math.abs(n - 200) <= 10));
    }

}
