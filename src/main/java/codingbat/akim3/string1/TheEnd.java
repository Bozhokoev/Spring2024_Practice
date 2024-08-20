package codingbat.akim3.string1;

public class TheEnd {
    public String theEnd(String str, boolean front) {
        if(front == !false){
            return str.substring(0,1);
        } else{
            return str.substring(str.length() -1);
        }
    }
}
