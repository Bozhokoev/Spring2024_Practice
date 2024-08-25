package codingbat.janat.string1;

public class FrontAgain {
    public boolean frontAgain(String str) {

        if (str.length() >= 2){
            String st = str.substring(0,2);
            return str.endsWith(st);
        }
        return false;
    }
}
