package codingbat.akbar.string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        if(str.length() > 1){
            int mid = str.length()/2;
            return  str.substring(mid-1,mid+1);
        }
        return "";
    }
}
