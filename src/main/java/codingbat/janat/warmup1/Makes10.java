package codingbat.janat.warmup1;

public class Makes10 {
    public boolean makes10(int a, int b) {
        if(a == 10 || b == 10){
            return true;
        }
        if (a + b == 10){
            return true;
        }
        else {
            return false;
        }
    }

}
