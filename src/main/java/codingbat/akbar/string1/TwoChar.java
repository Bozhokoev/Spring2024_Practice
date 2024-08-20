package codingbat.akbar.string1;

public class TwoChar {
    public String twoChar(String str, int index) {
        String res = "";
        if(str.length() >= index+2 && index > 0){
            res += str.substring(index,index+2);
        }else{
            res+=str.substring(0,2);
        }
        return res;
    }
}
