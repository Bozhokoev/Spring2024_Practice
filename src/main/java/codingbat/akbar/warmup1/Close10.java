package codingbat.akbar.warmup1;

public class Close10 {

    public int close10(int a, int b) {
        int resA = 0;
        int resB = 0;

//  int result = 0;

        if(a >= 10){
            resA= a - 10;
        }else if(a < 10){
            resA = 10 - a;}


        if(b >= 10){
            resB= b - 10;
        }else if(b < 10){
            resB = 10 - b;}


        if(resB == resA){
            return 0;
        }else if(a > b){
            return b;
        }else{
            return a;
        }

    }
}
