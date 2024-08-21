package codingbat.dana.string1;

public class ExtraFront {

    public String extraFront(String str) {
        if (str.length() > 0) {
            int length = (str.length() < 2) ? str.length() : 2;
            return (str.substring(0,length) + str.substring(0,length) + str.substring(0,length));
        } else {
            return "";
        }
    }
}
