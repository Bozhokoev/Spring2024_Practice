package codingbat.akbar.string1;

public class MiddleThree {
    public String middleThree(String str) {
        if(str.length() >=3){
            int mid = str.length()/2;

            return str.substring(mid-1,mid+2);
        }
        else{
            return str;
        }
    }
}
