package codingbat.akim3.string1;

public class MinCat {
    public String minCat(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();
        if (l1 > l2) {
            int res = l1-l2;
            return a.substring(res)+b;
        } else if (l1 < l2){
            int res1 = l2 - l1;
            return a+b.substring (res1);
        }return a + b;
    }
}
