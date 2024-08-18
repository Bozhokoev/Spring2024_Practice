package codingbat.akbar.warmup1;

public class Max1020 {
    public int max1020(int a, int b) {
        int ares;
        int bres;
        if(a >= 10 && a <=20 ){
            ares = a;
        }else{
            ares = 0;
        }

        if(b >= 10 && b <= 20){
            bres = b;
        }else {
            bres = 0;
        }
        return Math.max(bres,ares);

    }
}
