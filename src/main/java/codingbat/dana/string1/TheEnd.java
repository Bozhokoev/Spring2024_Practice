package codingbat.dana.string1;

public class TheEnd {

    public String theEnd(String str, boolean front) {
        String st = str.substring(0,1);
        String st2 = str.substring(str.length()-1);
        return front ? st : st2;
    }
}
