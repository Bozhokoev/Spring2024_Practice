package codingbat.akim3.string1;

public class ConCat {
    public String conCat(String a, String b) {
        int l1 = a.length ();
        int l2 = b.length ();
        if (l1 >=1  && l2 >=1) {
            if (a.charAt (l1 - 1) == b.charAt(0)){
                return a + b.substring(1);
            }
        }return a + b;
    }
}
