package codingbat.jyldyzbek.warmup1;

public class BackAround {

    public String backAround(String str) {
        String front = str.substring(str.length() -1);
        return front + str + front;

    }

}
