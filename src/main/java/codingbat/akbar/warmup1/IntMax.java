package codingbat.akbar.warmup1;

public class IntMax {public int intMax(int a, int b, int c) {
    int mas = 0;
    if(a > b){
        mas = a;
    }else{
        mas = b;
    }
    if(c>mas){
        return c;
    }else{
        return mas;
    }
}
}
