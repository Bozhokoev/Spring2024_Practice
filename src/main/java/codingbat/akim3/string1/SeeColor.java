package codingbat.akim3.string1;

public class SeeColor {
    public String seeColor(String str) {
        if(str.startsWith("red")){
            return "red";
        }else if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }
}
