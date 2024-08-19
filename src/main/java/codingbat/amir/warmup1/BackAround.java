package codingbat.amir.warmup1;

public class BackAround {

    public String backAround(String str) {
        String str2 = str.substring(str.length() - 1);
        return str2 + str + str2;
    }
}
