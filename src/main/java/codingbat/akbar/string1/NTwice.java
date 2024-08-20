package codingbat.akbar.string1;

public class NTwice {
    public String nTwice(String str, int n) {
        String res = "";
        if(str.length() >= n ){
            res += str.substring(0,n);
            res+= str.substring(str.length()-n);
        }
        return res;
    }
}
