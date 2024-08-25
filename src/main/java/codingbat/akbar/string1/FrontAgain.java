package codingbat.akbar.string1;

public class FrontAgain {
    public boolean frontAgain(String str) {
        if(str.length() <= 1){
            return false;
        }
        String first =  str.substring(0,2);
        if(str.endsWith(first)){
            return true;
        }
        else{
            return false;
        }
    }
}
