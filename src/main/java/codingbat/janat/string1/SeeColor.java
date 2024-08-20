package codingbat.janat.string1;

public class SeeColor {
    public String seeColor(String str) {
        String st = "red";
        if (str.startsWith(st)){
            return st;
        } else if (str.startsWith("blue")){
            return "blue";
        } return "";
    }

}
