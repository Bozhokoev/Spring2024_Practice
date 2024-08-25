package codingbat.syrgak1.warmup1;

public class Front22 {
    public String front22(String str) {
        String front;
        if(str.length() < 2)
            front = str;
        else
            front = str.substring(0, 2);
        return front + str + front;
    }
}
